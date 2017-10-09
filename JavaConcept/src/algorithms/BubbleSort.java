package algorithms;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr=new Integer[]{30,20,8,9,1,5,7,3,4,12};
		int cache,loop=0;
		System.out.println(arr.length);
		for (int i = 0; i < arr.length-1; i++) {//noneed to check the last left element would already be have sorted
			for (int j = 0; j < arr.length-1-i; j++) {
				//length-1-j bcoz after each iteration the righmost element would be sorted fully
				//Also the left most element would already be sorted
				if(arr[j]>arr[j+1]){
					cache=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=cache;
				}
				loop++;
			}
			printarray(arr);
		}
		printarray(arr);
		System.out.println("\nLooped -"+loop);
	}
	
	public static void printarray(Integer[] arr){
		for(int a:arr){
			System.out.print(a+" ");
		}
		System.out.println("");
	}

}
