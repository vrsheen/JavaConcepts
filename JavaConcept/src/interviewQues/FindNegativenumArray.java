package interviewQues;

public class FindNegativenumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr=new int[][]{
			{-6,-5,6},
			{-4,-3,4},
			{-2,-1,3},
			{-1,0,2}};
		int meetpnt=0;
		for (int i = 0; i < arr.length;) {
			if(meetpnt==0) meetpnt=arr[i].length-1;
			for (int j = meetpnt; j >=0; j--) {
				if(arr[i][j]<0){
					System.out.print(arr[i][j]+"\t");
					if(meetpnt==arr[i].length-1) meetpnt=j;
				}
			}
			i++;
			System.out.println("");
		}
	}

}
