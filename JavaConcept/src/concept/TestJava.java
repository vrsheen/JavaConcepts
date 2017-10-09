package concept;

import java.math.BigDecimal;
import java.util.Scanner;

public class TestJava {

	public static void main(String[] args) throws custException {
		// TODO Auto-generated method stub

		BigDecimal bd1=new BigDecimal("5.6");
		
		int i=10;
		byte n=10;
		System.out.println(i++);
		n=(byte)(n+1);
		System.out.println(n++);
		
		if(i<20){
			throw new custException("Invalid Value - Custom Exception");
		}
		
		
		
		
		float l1=5.6f;
		float l2=5.8f;
		System.out.println(l1+l2);
		
		double d1=5.6;
		double d2=5.8;
		System.out.println(d1+d2);
		System.out.println((-1)%10);
		System.out.println((10)%4);

//		System.out.println(Byte.MIN_VALUE+" to "+ Byte.MAX_VALUE);
		
//		System.out.println(Short.MIN_VALUE+" to "+ Short.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE+" to "+ Integer.MAX_VALUE);
//		
//		System.out.println(Double.MIN_VALUE+" to "+ Double.MAX_VALUE);
	}

	/*public static void printme(){
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("                       Enter a number: ");
		int n = reader.nextInt();
		
		if (n==1){
			System.out.println("Evangelin");
		}
		else if (n==2){
			System.out.println("my dad is a good dad.");
		}
		else if (n==0 || n==404){
			System.out.println("Its Christina");
		}
		else if (n==9){
			System.out.println("Mom - Pradha");
		}
		else if (n==514){
			System.out.println("Ms Eng");
		}
		else if(n==100){
			System.out.println("friend -suhana");
		}
		else {
			System.out.println("I dont have anything for that number");
		}
	}*/
}
