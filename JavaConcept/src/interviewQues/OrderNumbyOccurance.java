package interviewQues;

import java.util.ArrayList;

public class OrderNumbyOccurance {

	static int  a[]={4,3,1,6,4,3,6,4};
	static int b[];
	static int twoDim[][];
	//Condition is shouldnot use the collection
	public static void main(String[] args) {
		
//Insertion sort
		bubblesort(a);
		
		int cnt=0,rownum=0;
		
		for (int i = 1; i < a.length; i++) {
			
//			if(a[i]!=a[i-1]){
//				twoDim[rownum][0]={{1,cnt}};
//				cnt=0;
//			}
				cnt++;
			System.out.println(a[i]);
		}
		
	}

	private static  void bubblesort(int[] a) {
		int c;
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if((j+1)<(a.length) && a[j]>a[j+1]){
					c=a[j+1];
					a[j+1]=a[j];
					a[j]=c;
				}
			}
			}
//		return a;
	}
}
