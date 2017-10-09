package com.algorithm.questions;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		String str="1234567";
		for (int i = 0; i < str.length(); i++) {
			char[] chr=new char[]{str.charAt(i)};
			a=Integer.parseInt(new String(chr));
			System.out.print(a);
		}
		System.out.println("");
		for (int i = 0; i < str.length(); i++) {
//			char[] chr=new char[]{str.charAt(i)};
			a=Integer.parseInt(new String(str.substring(i, i+1)));
			System.out.print(a);
		}
	}

}
