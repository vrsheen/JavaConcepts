package interviewQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find2Sum {

	public static void main(String[] args) {
//Find the second number by finding the difference of the number with expected number and try to find it in the list
		twoSummethod1(new Integer[]{2, 7, 11, 15},22);
//Come from both ends of the array and based on the values adjust the pointer
		twoSummethod2(new Integer[]{2, 7, 11, 15},22);
	}
	
	public static void twoSummethod1(Integer[] nums, int target) {
		List<Integer> arr=new ArrayList<Integer>(Arrays.asList(nums));
		Integer diff;
		for(int curnum:nums){
			diff=target-curnum;
			if(arr.contains(new Integer(diff)) || curnum==target){
				System.out.println("Method 1- Target num "+ target+" is sum of :"+curnum+" and "+diff);
				return;
			}
		}
		System.out.println("Method 1- Number not found");
		
    }
	
	public static void twoSummethod2(Integer[] nums, int target) {
		List<Integer> arr=new ArrayList<Integer>(Arrays.asList(nums));
		int lastpos=nums.length-1;
		for (int firstpos = 0; firstpos < lastpos;) {
			if(target==(arr.get(firstpos)+arr.get(lastpos))){
				System.out.println("Method 2- Target Sum "+target+" found :"+arr.get(firstpos)+" and "+arr.get(lastpos));
				return;
			}else if(target>(arr.get(firstpos)+arr.get(lastpos))){
				firstpos++;
			}else{
				lastpos--;
			}
			
		}
		System.out.println("Method 2- Number not found");
		
    }

}
