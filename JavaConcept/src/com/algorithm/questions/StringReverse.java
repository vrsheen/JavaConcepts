package com.algorithm.questions;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Sky is Blue";
		StringBuilder stb=new StringBuilder(str);
		stb.reverse();
		System.out.println(stb);
		
		char[] chrar=str.toCharArray();
		for(char ch:chrar){
			System.out.println(ch);
		}
		
		String st1="34";
		System.out.println(Integer.parseInt(st1));
	}

}
