package interviewQues;

public class NonRepeatingInteger {

	static int mid=0,min=0,max=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data={1,1,4,4,5,6,6};
		System.out.println(NonRepeatBinarySearch(data));
//		System.out.println(singleNonDuplicate(data));
//		System.out.println(nonRepeatingElement(data));
	}
	 public static int singleNonDuplicate(int[] nums) {
	        // binary search
	        int n=nums.length, lo=0, hi=n/2;
	        while (lo < hi) {
	            int m = (lo + hi) / 2;
	            if (nums[2*m]!=nums[2*m+1]) hi = m;
	            else lo = m+1;
	        }
	        return nums[2*lo];
	    }
		 
		    private static int nonRepeatingElement(int[] a) {
		        int element = 0;
		 
		        for (int i = 0; i < a.length; i++) {
		            element ^= a[i];
//		            System.out.println(element);
		        }
		 
		        return element;
		    }

	private static String NonRepeatBinarySearch(int[] data) {
		// TODO Auto-generated method stub
		min=0;
		max=data.length-1;
		while(min<=max && mid<data.length){
			mid=(min+max)/2;
			System.out.println(min+" "+mid+" "+max);
			if(isEven(mid)){
				if(data[mid]==data[mid+1]){
					min=mid+2;
				}else if(data[mid]==data[mid-1]){
					max=mid-2;
				}
				else return "Repeat = "+data[mid]+" @ "+mid;
			}else{
				if(data[mid]==data[mid-1]){
					min=mid+2;
				}else if(data[mid]==data[mid+1]){
					max=mid-2;
				}else return "Repeat = "+data[mid]+" @ "+mid;
			}
		}
		
		return "No non repeating number found";
	}
	private static boolean isEven(int mid){
		if (mid%2==0){
			return true;
		}else return false;
	}

	/*private static boolean afterRepeatint(int[] data,int mid) {
		// TODO Auto-generated method stub
		 if((data[mid]==data[mid+1]) ){
			 //|| (data[mid]==data[mid+1])
			 return true;
		 }else return false;
	}*/

}
