package algorithms;

public class Kadane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Kadane Algorithm -  Maximum Sum Subarray Problem
		// in Array [1,-3,2,1,-1] the max subarray is [2,1]

//		 String string = "1,1,1,-2,-1,10,-4,6";
		 String string = "13,-1,2,-4,5,1,5,-5";
		    String[] numbers = string.split(",");
		    int max_so_far = 0;
		    int max_ending_here = 0;
		    int posMin=0;
		    int curMin=1, curMax=1;
		    for (String num : numbers) {
		    	posMin++;
		        int x = Integer.parseInt(num);
		        if (x>=(max_ending_here + x)){
		        	curMin=posMin;
		        }
		        max_ending_here = Math.max(x, max_ending_here + x);
		        
		        if (max_ending_here>max_so_far){
		        	curMax=posMin;
		        }
		        max_so_far = Math.max(max_so_far, max_ending_here);
		        System.out.println("x="+x+" ||max_ending_here="+max_ending_here+"|| max_so_far="+max_so_far);
		        
		    }
		    System.out.println(max_so_far);
		    System.out.println(curMin+"---"+curMax);
	}
	
	

}
