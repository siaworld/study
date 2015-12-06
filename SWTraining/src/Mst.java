import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Mst {

	public static int[][] adjMatrix = null;
	public static List<Edge> edges = null;
	public static boolean[] visited = null;
	public static class Edge{
		int sV, eV;
		int w;
		public Edge(){};
	}
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    	Scanner sc = new Scanner(System.in);
    	
    	int nVer, nEdges, vStart;
    	nVer = sc.nextInt();
    	nEdges = sc.nextInt();
    	adjMatrix = new int[nVer+1][nVer+1];
    	visited = new boolean[nVer+1];
    	edges = new LinkedList<Edge>();
    	//Filling the Graph with the given input.
    	for(int i =0; i <nEdges; i++)
    	{
    		Edge edge = new Edge();
    		edge.sV = sc.nextInt();
    		edge.eV = sc.nextInt();
    		if(edge.sV > edge.eV)
    		{
    			int temp = edge.sV;
    			edge.sV = edge.eV;
    			edge.eV = temp;
    		}
    		edge.w = sc.nextInt();
    		if(edge.w < adjMatrix[edge.sV][edge.eV])
    		{
    			// if edge inputs duplicated, then, leave the small one.
    		}
    		adjMatrix[edge.sV][edge.eV] = edge.w;
    		adjMatrix[edge.eV][edge.sV] = edge.w;
    		edges.add(edge);
    	}
    	vStart = sc.nextInt();
    	visited[0] = true;
    	visited[vStart] = true;
    	
    
    }
}