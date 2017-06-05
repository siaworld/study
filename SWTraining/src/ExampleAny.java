import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExampleAny {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    	Scanner sc = new Scanner(System.in);
    	int[] test ;
    	int test1[];
    	test = new int[5];
    	test1 = new int[5];
    	ExampleAny[] testSol = new ExampleAny[3];
    	
    	List<Integer> TestList = new ArrayList<>();
    	SortedSet<Integer> sortedSet = new TreeSet<>();
    	sortedSet.addAll(Arrays.asList(1,3,2,4,5,7,0));
    	Iterator<Integer> it = sortedSet.iterator();
    	System.out.println(sortedSet);
    	while(it.hasNext()){
    		System.out.println(it.next());
    		
    	}
    	TestList.add(1);
    	
    	PriorityQueue<Integer> queue = new PriorityQueue<>(10, Collections.reverseOrder());
    	queue.offer(1);
    	queue.offer(2);
    	queue.offer(3);
    	queue.addAll(Arrays.asList(1,3,2,4,5,7));
    	
    	Integer val = null;
    	while( (val = queue.poll()) != null) {
    	    System.out.println(val);
    	}
    	Map<String, String> strMap = new HashMap<String, String>();
    	
    	
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