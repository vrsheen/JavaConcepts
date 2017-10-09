package com.collections;

import java.util.Comparator;

public class ObjectIdComparator implements Comparator<ObjectforFun> {

	@Override
	public int compare(ObjectforFun o1, ObjectforFun o2) {
		// TODO Auto-generated method stub
		 if (o1.getId() > o2.getId()) {
		        return 1;
		    }else if (o1.getId() < o2.getId()) {
		        return -1;
		    }else return 0;
	}

	
}
