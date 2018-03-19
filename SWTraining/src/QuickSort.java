import java.util.*;

public class QuickSort {

	static void sort(int[] numbs, int left, int right){
		int l=left;
		int r= right;
		int pivot = numbs[(l+r)/2];
		
		do{
			while(numbs[l]<pivot)l++;
			
			while(numbs[r]>pivot)r--;
			
			if(l<=r){
				int temp = numbs[r];
				numbs[r] = numbs[l];
				numbs[l] = temp;
				l++;
				r--;
			}
		}while(l<=r);
		
		if(left<r)
			sort(numbs, left, r);
		if(l<right)
			sort(numbs, l, right);
	}
	
	public static void main(String[] args){
		int[] numbs ={1,4,2,5,6,0,9,-1};
		//sort(numbs, 0,7);
		//Arrays.sort(numbs);
		List<Integer> numList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		Iterator<Integer> it = numList.iterator();
		
		while(it.hasNext()){
			int temp = it.next();
			System.out.println("num : " + temp);
		}
		Scanner sc = new Scanner(System.in);
		List<Integer> test = new LinkedList<Integer>();

		//Set<Integer> numSet = new LinkedHashSet<Interger>(6,7,8);
		
		System.out.println("end");
		//System.out.println(numList.toString());
		Arrays.sort(numbs);
		
		for(int i = 0 ; i < numbs.length;i++)
			System.out.println(numbs[i]);
		//ArrayList<Character> charList = new ArrayList<Character>();
		
		
		
		
	}
}
