import java.io.*;
import java.util.Scanner;
public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    
    	Scanner sc = new Scanner(System.in);
    	int N, B;
    	N = sc.nextInt(); // num of Cities
    	B = sc.nextInt(); // num of clinics
    	int[] popul = new int[N];
    	int[] clinics = new int[N];

    	for(int i = 0; i < N; i++)
    	{
    		popul[i] = sc.nextInt();
    	}
    	int maxAvg = Integer.MIN_VALUE;
    	int cnt = 0;
		while(cnt <= B)
		{
			for(int i=0; i<N; i++)
			{
				int cl = clinics[i];
				int avg = popul[i] /(cl+1);
				if(avg >= maxAvg)
				{
					clinics[i] += 1;
					cnt += 1;
					maxAvg = popul[i] / (clinics[i]+1);					

				}
			}
		}
		maxAvg = 0;
		for(int i = 0 ; i < N; i++)
		{
			int v = popul[i] / clinics[i];
			if (maxAvg <= v)
				maxAvg = v;
		}
    	
    	sc.close();
    	System.out.println(maxAvg);
    }
    
}