package com.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public void printLst(List<ObjectforFun> arrLst) {
		for (ObjectforFun obj : arrLst) {
			System.out.println(obj.getName());
		}
	}

	public List<ObjectforFun> genList() {
		List<ObjectforFun> arrLst = new LinkedList<ObjectforFun>();
		System.out.println("The below proves ArrayList accepts multiple NULLs and anywhere");

		// arrLst.add(new ObjectforFun(null));
		arrLst.add(new ObjectforFun("JavaLnk",1));
		arrLst.add(new ObjectforFun("AeroplaneLnk",2));
		arrLst.add(new ObjectforFun("SmokeLnk",3));
		arrLst.add(new ObjectforFun(null,4));
		arrLst.add(new ObjectforFun("AppleLnk",5));
		arrLst.add(new ObjectforFun("BabyLnk",6));
		arrLst.add(new ObjectforFun(null,7));
		System.out.println("The below proves ArrayList accepts Duplicates");
		arrLst.add(new ObjectforFun("BabyLnk",8));
		arrLst.add(new ObjectforFun("zoomLnk",9));
		arrLst.add(new ObjectforFun("SupermanLnk",10));
		arrLst.add(new ObjectforFun("DragonLnk",11));

		return arrLst;
	}
}
