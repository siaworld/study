import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Encryption {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
 
    	Scanner sc = new Scanner(System.in);
    	
    	char[][] words = null;
    	int nRow, nCol; nRow=0;nCol=0;
    	int nlength;
    	String input = sc.nextLine();
    	
    	//input.replaceAll(" ", "");
    	nlength = input.length();
    	
    	nRow = (int) Math.floor(Math.sqrt((double)nlength));
    	nCol = (int) Math.ceil(Math.sqrt((double)nlength));
    	
    	if (nRow * nCol < nlength)
    	{
    		nRow = nCol;
    	}
    	words = new char[nRow][nCol];
    	for(int i = 0; i <nRow ; i++)
    	{
    		for(int j =0;j <nCol; j++)
    		{
    			if((i*nCol + j) < nlength)
    			{
    				words[i][j] = input.charAt(i*nCol + j) ;
    			}
    			else
    			{
    				break;
    			}
    		}
    	}
    	char[][] encrypt = new char[nCol][nRow];
    	for(int i = 0; i <nCol ; i++)
    	{
    		
    		for(int j =0;j <nRow; j++)
    		{
    			
    				encrypt[i][j] = words[j][i];
    				if(encrypt[i][j] !=0)
    					System.out.print(encrypt[i][j]);
    			
    		}
    		System.out.print(" ");
    	}
    	System.out.println();
    	
    	
    }
}