import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringCompare {
    /* Head ends here */
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
    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long res;

        int _t_cases = Integer.parseInt(in.nextLine());
        for (int _t_i = 0; _t_i<_t_cases; _t_i++) {
            String _a = in.nextLine();
            res = stringSimilarity(_a);
            System.out.println(res);
            
            
        }
    }
}