package com.algorithm.questions;

public class PyramidPattern {

	public static void main(String[] args) {
		int maxStr=9;
			genPyramid(maxStr);
		makePyramid(maxStr);
	}

	public static void makePyramid(int n)
	 {
	  for(int i=n;i>=0;i--){
	   for(int j=0;j<n;j++){
	    if(j>=i) System.out.print("*");
	    System.out.print(" ");
	   }
	   System.out.print("\n");
	  }
	 }
	public static void genPyramid(int maxStr) {
	for (int curStr = 1; curStr <= maxStr; curStr+=2) {
			for (int i = 0; i < maxStr; i++) {
				if(i<((maxStr-curStr)/2) || i>=(maxStr-(maxStr-curStr)/2)){
					System.out.print(" ");
				}else
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
