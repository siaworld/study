import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static long stringSimilarity(String a) {
    	
    	int n = a.length();
    	long result = (long)n;
        List<Integer> z = new ArrayList<Integer>();
        
        int i,l,r;i=0;l=0;r=0;
        z.add(0);
        //z.add(0);
    	for (i = 1, l = 0, r = 0; i < n; ++i) {
            z.add(0);
            if (i <= r)
                z.add(i, Math.min(r - i + 1, z.get(i - l)));
            while (i + z.get(i) < n && a.charAt(z.get(i)) == a.charAt(z.get(i)+i))
                z.set(i, z.get(i)+1);
            if (i + z.get(i) - 1 > r)
            {
            	l = i;
            	r = i + z.get(i) - 1;
            }
                
        }
    	for(int cnt : z)
    	{
    		result += cnt;
    	}
        return result;
    }
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    	Scanner sc = new Scanner(System.in);
    	
    	int T;
    	T = sc.nextInt();
    	for(int i = 0 ; i <T; ++i)
    	{
    		String inputA = sc.next();
    		String inputB = sc.next();
    		String combAB = inputA.concat("A").concat(inputB);
    		
    		long result = stringSimilarity(combAB);
    		
    		
    		if(result > inputA.length()+inputB.length())
                System.out.println("YES");
            else
    			System.out.println("NO");
    	}
    	sc.close();
    
    }
}