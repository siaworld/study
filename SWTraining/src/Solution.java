import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    	Scanner sc = new Scanner(System.in);
    	
    	int T;
    	T = sc.nextInt();
    	for(int i = 0 ; i <T; ++i)
    	{
    		char[] inputA = sc.nextLine().toCharArray();
    		char[] inputB = sc.nextLine().toCharArray();
    		int k,j;k=0;j=0;
            boolean find=false;
    		for( k=0 ; k < inputA.length ; k++ )
    		{
    			for( j=0; j < inputB.length; j++)
    			{
    				if(inputA[k] == inputB[j])
    				{
    					k = inputA.length;
                        j = inputB.length;
                        find = true;
    				    break;
    				}
    			}
    		}
    		if(find)
                System.out.println("YES");
            else
    			System.out.println("NO");
    	}
    	sc.close();
    
    }
}