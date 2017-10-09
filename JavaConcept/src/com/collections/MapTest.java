package com.collections;

import java.util.*;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> mapex=new HashMap<Integer,String>();
		mapex.put(1, "Sheen");
		mapex.put(2, "Pradha");
		mapex.put(3, "Evangi");
		mapex.put(4, "Christy");
		
		for(Map.Entry<Integer, String> entry:mapex.entrySet()){
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
		
	}

}
