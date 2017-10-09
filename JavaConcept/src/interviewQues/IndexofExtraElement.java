package interviewQues;

import java.util.Scanner;

public class IndexofExtraElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr=new int[]{2,4,6,8,9,10,12};
		int[] arr1;
		int[] arr2;
		Scanner reader=new Scanner(System.in);
		int size=Integer.parseInt(reader.nextLine());
		for (int i = 0; i < size; i++) {
			arr1= strToint(reader.nextLine().split(" "));
			arr2= strToint(reader.nextLine().split(" "));
			findmissingele(arr1,arr2);
		}

	}

	private static int[] strToint(String[] nextLine) {
		// TODO Auto-generated method stub
		int[] convInt=new int[nextLine.length];
		for (int i = 0; i < nextLine.length; i++) {
			convInt[i]=Integer.parseInt(nextLine[i]);
		}
		return convInt;
	}

	private static void findmissingele(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int[] barr,sarr;
		if(arr1.length>arr2.length){
			barr=arr1;
			sarr=arr2;
		}else{
			barr=arr2;
			sarr=arr1;
		}
		for (int i = 0; i < barr.length; i++) {
			if(barr[i]!=sarr[i]){
				System.out.println("Extra Element is "+barr[i]);
				return;
			}
		}
		System.out.println("No Extra Element");
	}
	
	public int findExtra(int a[],int b[],int n)
    {
     // add code here.
     int extraele=0;
     int[] barr,sarr;
     if(a.length>b.length){
         barr=a;
         sarr=b;
     }else{
         barr=b;
         sarr=a;
     }
     
     for(int i=0;i<=barr.length;i++){
         if(barr[i]!=sarr[i]){
             extraele= barr[i];
             break;
         }
     }
     return extraele;
 
    }

}
