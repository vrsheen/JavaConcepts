package com.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {


	public void printLst(Set<ObjectforFun> hshSet) {
		for (ObjectforFun obj : hshSet) {
			if (obj!=null){
				System.out.println(obj.getName()+"-"+obj.getId());
			}else {System.out.println("Null");}
		}
	}

	public Set<ObjectforFun> genList() {
		Set<ObjectforFun> hshSet = new HashSet<ObjectforFun>();
		System.out.println("The below proves HashSet accepts multiple NULLs and anywhere");

		// hshSet.add(new ObjectforFun(null));
		ObjectforFun dupObj=new ObjectforFun("Java",1);
		hshSet.add(dupObj);
		hshSet.add(new ObjectforFun("DuplicateDotEqualsTest",2));
		hshSet.add(new ObjectforFun("Smoke",3));
		hshSet.add(null);
		hshSet.add(dupObj);
		hshSet.add(new ObjectforFun("DuplicateDotEqualsTest",2));
		hshSet.add(new ObjectforFun("DuplicateDotEqualsTest",3));
		hshSet.add(new ObjectforFun("Apple",5));
		hshSet.add(new ObjectforFun("Baby",6));
//		hshSet.add(null);
		System.out.println("The below proves HashSet accepts Duplicates");
		hshSet.add(new ObjectforFun("Baby",8));
		hshSet.add(new ObjectforFun("zoom",9));
		hshSet.add(new ObjectforFun("Superman",10));
		hshSet.add(new ObjectforFun("Dragon",11));

		return hshSet;
	}
}
