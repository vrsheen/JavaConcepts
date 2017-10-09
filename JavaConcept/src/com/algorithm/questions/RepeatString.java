package com.algorithm.questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="durgadurgadurgadurga";
		Map<Character,Integer> mps=new LinkedHashMap<Character,Integer>();
		for (int i = 0; i < str.length(); i++) {
			mps.put(str.charAt(i), (mps.get(str.charAt(i))==null?1:(mps.get(str.charAt(i))+1)));
		}
		System.out.println(mps);
	}

}
