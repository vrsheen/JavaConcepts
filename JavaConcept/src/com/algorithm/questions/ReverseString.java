package com.algorithm.questions;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString obj=new ReverseString();
		String str="position 1 @ Durga is This";
		obj.method2(str);
		
	}
	
	public void method1(String str){
		
		StringBuilder stb=new StringBuilder();
		String[] strobj=str.split(" ");
		for(int i=strobj.length-1;i>=0;i--){
			stb.append(strobj[i]+" ");
		}
		System.out.println(stb.toString());
	}
	
	public void method2(String str){
		//Reverse the String - position 1 @ Durga is This
		//First step (each word swap) - noitisiop 1 @ agruD si sihT
		//Secon Step (entire sentence swap) - This is Durga @ 1 position - 
		StringBuilder stb=new StringBuilder(str);
		int curpos=0;int begnpos=0;
		while(curpos<stb.length()){
			System.out.println(curpos+"_- "+stb.charAt(25));
			if(stb.charAt(curpos)==' ' || curpos==(stb.length()-1)){
				stb.replace(begnpos, curpos+1, swap(stb.substring(begnpos, curpos+1)));
				begnpos=curpos+1;
			}
			curpos++;
		}
		stb=new StringBuilder(swap(stb.toString()));
		System.out.println(stb.toString());
	}

	private String swap(String substring) {
		StringBuilder stb=new StringBuilder(substring);
		for(int i=0, j=stb.length()-1;i<=(stb.length()-1)/2;i++,j--){
			char st=stb.charAt(i);
			stb.setCharAt(i, stb.charAt(j));
			stb.setCharAt(j, st);
		}
		System.out.println("StringSwap=");
		return stb.toString();
	}
	//position - noitisop
}
