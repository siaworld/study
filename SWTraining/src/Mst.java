import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Mst {

	public static List<Edge> edges = null;
	public static List<Integer> visited = null;
	public static class Edge{
		int sV, eV;
		int w;
		public Edge(){};
	}
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    	Scanner sc = new Scanner(System.in);
    	List<Edge> Tedges = new LinkedList<Edge>();
    	
    	int nVer, nEdges, vStart;
    	int branches = 0;
    	nVer = sc.nextInt();
    	nEdges = sc.nextInt();
    	
    	edges = new LinkedList<Edge>();
    	
    	//Filling the Graph with the given input.
    	for(int i =0; i <nEdges; i++)
    	{
    		Edge edge = new Edge();
    		edge.sV = sc.nextInt();
    		edge.eV = sc.nextInt();
    		edge.w = sc.nextInt();
    		edges.add(edge);
    	}
    	vStart = sc.nextInt();
    	visited = new ArrayList<Integer>();
    	visited.add(vStart);
		
		while(!edges.isEmpty() && branches < nVer-1)
    	{
    		Edge t = new Edge();
    		int minW = Integer.MAX_VALUE;
    		int nextVisit = 0;
    		boolean bFound = false;
    		int iminE = 0;
    		for(int k=0; k < edges.size();k++)
    		{
    			t = edges.get(k);
    			if( (visited.contains(t.sV) && !visited.contains(t.eV)) || (!visited.contains(t.sV) && visited.contains(t.eV)))
        		{
    				bFound = true;
        			if(t.w < minW)
        			{
        				minW = t.w;
        				iminE = k;
        				
        			}
        		}
    			
    		}
    		
    		if(bFound)
    		{
    			branches +=1;
    			Tedges.add(edges.get(iminE));
    			if(visited.contains(edges.get(iminE).sV))
    				visited.add(edges.get(iminE).eV);
    			else
    				visited.add(edges.get(iminE).sV);
    				
    			edges.remove(iminE);
    		}
    		else
    		{
    			break;
    		}
    		// add edge to branch and remove edge from the origin edges and loop again.
    		
    	}
		int tW =0;
    	
    		for(int i=0; i < Tedges.size();i++)
    		{
    			int w = Tedges.get(i).w;
    			tW += w;
    		}
    	
    	System.out.println(tW);
    	
    	sc.close();
    
    }
}