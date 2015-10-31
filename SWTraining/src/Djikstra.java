import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Djikstra {

	public static int[][] matrix;
	public static long[] distance;
	public static int[] predecessor;
	
	public static void initMatrix(int N)
	{
		matrix = new int[N+1][N+1];
	}
	public static void findPath(int s_node, int numNodes )
	{
		int i,j;
		distance = new long[numNodes+1];
		predecessor = new int[numNodes+1];
		List<Integer> newReachable = new ArrayList<Integer>();
		
		for(i = 1; i <= numNodes; i++)
		{
			distance[i] = matrix[s_node][i];
			
			if(distance[i] == 0 )
			{
				predecessor[i] = -1; // unconnected.
			}else
			{
				distance[s_node] = 0;
				predecessor[i] = s_node;
				newReachable.add(i);
			}
		}
		predecessor[s_node] = 0;
		
		while(!newReachable.isEmpty())
		{
			Iterator<Integer> iNR = newReachable.iterator();
			int v = iNR.next();
			while(iNR.hasNext())
			{
				int w = iNR.next();
				if(distance[v] > distance[w])
				{
					v=w;
				}
			}
			newReachable.remove((Integer)v);
			for(j = 1;j <=numNodes;j++)
			{
				if(matrix[v][j] != 0 && (predecessor[j] == -1 || (distance[j] > distance[v]+matrix[v][j])))
				{
					distance[j]=distance[v]+matrix[v][j];
					
					if(predecessor[j] == -1)
					{
						newReachable.add(j);						
					}
					predecessor[j] = v;
					
				}
				
			}
		}
		
		for(i= 1; i <=numNodes ; i++)
		{
			if(i != s_node)
				System.out.print(distance[i]+" ");
		}
		System.out.println();
		
	}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	int T, i,j, N, M, x, y, r, s;
/*    	try {
			System.setIn(new FileInputStream("C:\\Users\\h2jba_000\\workspace\\SWTraining\\src\\res\\input.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    	
    	Scanner sc = new Scanner(System.in);
    	
    	T = sc.nextInt();
    	N = sc.nextInt();
    	M = sc.nextInt();
    	initMatrix(N);
    	for(i = 1; i < M+1;i++)
    	{
    		x = sc.nextInt();
    		y = sc.nextInt();
    		r = sc.nextInt();
    		
			if(matrix[x][y] > r || matrix[x][y] == 0)
			{
				matrix[x][y] = r;
	    		matrix[y][x] = r;
			}
    		
    		
   
    	}
    	s = sc.nextInt();
    	findPath(s,N);
    	
    	
    }
}