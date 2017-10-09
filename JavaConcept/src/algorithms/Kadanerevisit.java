package algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Kadanerevisit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Find the largest subset of numbers having max sum and also display the subset
		int[] arr=new int[] {13,-1,2,-4,5,1,5,-5};
		int maxatpre=arr[0],globalmaxnum=0;
		List<Integer> globalarr=new ArrayList<Integer>();
		globalarr.add(maxatpre);
		for (int i = 1; i < arr.length; i++) {

			
		if((maxatpre+arr[i])>arr[i]){
			maxatpre=maxatpre+arr[i];
		}else{
			maxatpre=arr[i];
			globalarr.clear();
		}
		
		if(maxatpre>globalmaxnum){
			globalmaxnum=maxatpre;
			globalarr.add(arr[i]);
		}
		}
		System.out.println("Max Subset sum is "+globalmaxnum+" with the subset "+globalarr);
	}

}
