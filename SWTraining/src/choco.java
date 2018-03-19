import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class choco {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    	Scanner sc = new Scanner(System.in);
    	
    	int T, N, minVal;
    	int diff, mincount;
    	int[] choco;
    	int count = 0;
    	
    	T = sc.nextInt();
    	for(int tc = 0; tc <T ; tc++)
    	{
    		N = sc.nextInt();
        	
        	choco = new int[N];
        	for(int i = 0; i <N; i++)
        		choco[i] = sc.nextInt();
        	
        	if (N<2)
        		continue;
        	
        	minVal = choco[0];
        	
        	for(int i = 1; i <N; i++)
        		if(minVal > choco[i])
        			minVal = choco[i];
        	mincount = Integer.MAX_VALUE;
        	for(int i = 0; i<=5; i++)
        	{
        		
        		//mincount = Integer.MAX_VALUE;
        		count = 0;
        		for(int j = 0; j < N; j++)
        		{
        			diff = choco[j] - (minVal -i);
        			count += diff/5 + (diff%=5)/2 + (diff&1);
        		}
        		if ( mincount > count)
        			mincount = count;
        		
        	}
        	System.out.println(mincount);
    	}
    	

    }
}