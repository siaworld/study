import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    	Scanner sc = new Scanner(System.in);
    	
    	int T;
    	T = sc.nextInt();
    	for(int i = 0 ; i <T; ++i)
    	{
    		char[] inputA = sc.next().toCharArray();
    		char[] inputB = sc.next().toCharArray();
    		int k,j;k=0;j=0;
            boolean find=false;
            boolean[] present = new boolean[26];
            
			for(char c : inputA)
			{
				present[c - 'a'] = true;
			}
            for( char c : inputB )
    		{
    			if(present[c - 'a'])
    			{
    				find = true;
    				break;
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