package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {
	// Final Summary
	// 1) NULL - How many and which location , should check for both Key and
	// value
	// > ArrayList accepts multiple NULLs and anywhere
	// 2) Insertion Order - Is the insertion order Maintained
	// > ArrayList maintains Insertion order
	// 3) Allow Duplicates - Yes or No
	// > Yes
	// 4) Synchroznied - Yes or No
	// 5) Sorting 


	public void printLst(List<ObjectforFun> arrLst) {
		for (ObjectforFun obj : arrLst) {
			System.out.println(obj.getName());
		}
	}

	public List<ObjectforFun> genList() {
		List<ObjectforFun> arrLst = new ArrayList<ObjectforFun>();
		System.out.println("The below proves ArrayList accepts multiple NULLs and anywhere");

		// arrLst.add(new ObjectforFun(null));
		arrLst.add(new ObjectforFun("Java",1));
		arrLst.add(new ObjectforFun("Aeroplane",2));
		arrLst.add(new ObjectforFun("Smoke",3));
		arrLst.add(new ObjectforFun(null,4));
		arrLst.add(new ObjectforFun("Apple",5));
		arrLst.add(new ObjectforFun("Baby",6));
		arrLst.add(new ObjectforFun(null,7));
		System.out.println("The below proves ArrayList accepts Duplicates");
		arrLst.add(new ObjectforFun("Baby",8));
		arrLst.add(new ObjectforFun("zoom",9));
		arrLst.add(new ObjectforFun("Superman",10));
		arrLst.add(new ObjectforFun("Dragon",11));
		
		return arrLst;
	}

}
