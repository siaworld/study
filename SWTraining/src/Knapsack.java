import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Knapsack {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    	Scanner sc = new Scanner(System.in);
    	
    	int T, N, goal;
    	T = sc.nextInt();
    	int[] element; 
    	
    	int[] memEval;
    	
    	for(int i = 0; i < T; i++)
    	{
    		N = sc.nextInt();
    		goal = sc.nextInt();
    		
    		element = new int[N];
    		for(int j = 0; j < N ; j++)
    		{
    			element[j] = sc.nextInt(); 
    		}
    		
    		memEval = new int[goal+1];
    		
    		for(int weight =1 ; weight <= goal; ++weight)
    		{
    			for(int j=0; j < N;j++)
    			{
    				if(element[j] <= weight)
    				{
    					memEval[weight] = Math.max(memEval[weight],(element[j] + memEval[weight - element[j]]));
    				}
    				
    			}
    		}
    		
    		System.out.println(memEval[goal]);
			
    	}
    	
      }
}