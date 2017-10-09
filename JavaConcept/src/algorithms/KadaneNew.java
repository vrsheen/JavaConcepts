package algorithms;

import java.util.ArrayList;
import java.util.List;

public class KadaneNew {

	public static void main(String[] args) {
		// Kadanes Algorithm -Unordered list- Finds the highest subset combination of numbers in the arrya which makes the highest sum
//		int[] arr = new int[]  {1,-1,2,-14,9,5,-3,5,-5}; // 16 middle
		int[] arr = new int[]  {13,-1,2,-4,5,1,5,-5}; //21 left
//		int[] arr = new int[]  {1,-1,2,-14,9,5,-3,5,-5,-16,1,16}; //17 right
		method1(arr);
		method2(arr);
		revision(arr);
		
	}
	
	//Best Method as below
	private static void revision(int[] arr) {
		// TODO Auto-generated method stub
		int globalMax=arr[0];
		int totSum=0;String com="";
		String kadaneSubSet=String.valueOf(arr[0]),subSet="";
		for(int num:arr){
			if (num==-16){
				System.out.println(num);
			}
			if(num>totSum){
				totSum=num;
				subSet=String.valueOf(num);
			}else {totSum=totSum+num;subSet=subSet+com+String.valueOf(num);}
			if(totSum>globalMax || globalMax==0){
				globalMax=totSum;
				kadaneSubSet=subSet;
			}
			com=",";
		}
		System.out.println(globalMax+" with subset of "+kadaneSubSet);
	}
	
	
	public static void method2(int[] arr){
		
		List<Integer> maxatpos = new ArrayList<Integer>();
		int maxnum=0;
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				maxatpos.add(i, arr[i]);
			} else if ((arr[i] + maxatpos.get(i - 1)) > arr[i]) {
				maxatpos.add(i, (arr[i] + maxatpos.get(i - 1)));
				if (maxnum<maxatpos.get(i)){
					maxnum=maxatpos.get(i);
				}
			} else {
				maxatpos.add(i, arr[i]);
			}
		}
		System.out.println("Method 2 - Max Subset is = "+maxnum);
	}
	
	public static void method1(int[] arr){
			int maxnum=0,globalmax=0;String kadaneSubSet="",subSet="";
			for (int i = 0; i < arr.length; i++) {
				if (i == 0) {
					maxnum=arr[i];
					globalmax=maxnum;
					subSet=String.valueOf(maxnum);
				} else if ((arr[i] + maxnum) > arr[i]) {
					maxnum=arr[i]+ maxnum;
					subSet=subSet+","+arr[i];
					if(maxnum>globalmax){
						globalmax=maxnum;
						kadaneSubSet=subSet;subSet="";
					}
				} else {
					maxnum=arr[i];
					subSet=String.valueOf(maxnum);
				}
			}
			System.out.println("Method 1 - Max Subset is = "+globalmax+" with subset of "+kadaneSubSet);
		}
	


}
