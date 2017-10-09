package concept;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class ArrayandLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList alobj = new ArrayList();
		LinkedHashSet llobj = new LinkedHashSet();
		dotimings("ArrayList", alobj);
		dotimings("LinkedHashSet", llobj);
	}

	public static void dotimings(String arrtype, Collection lst) {

		//Sequential Insert
		lst.add("str1");
		lst.add("str");
		long strttime = System.currentTimeMillis();
		for (int i = 0; i < 17; i++) {
			lst.add(i);
		}
		lst.add("str");
		long endtime = System.currentTimeMillis();
		System.out.println(lst);
		System.out.println("Time Taken for sequential insert= " + (endtime - strttime)
				+ " ms for type " + arrtype);
		
	/*	//Middle Insert
		strttime = System.currentTimeMillis();
		lst.add(9999,100);
		endtime = System.currentTimeMillis();
		System.out.println("Time Taken for middle insert= " + (endtime - strttime)
				+ " ms for type " + arrtype);
		
		//Middle read
				strttime = System.currentTimeMillis();
				long gtvr=lst.get(9999999);
				endtime = System.currentTimeMillis();
				System.out.println("Time Taken for middle read for " + gtvr+" is "+(endtime - strttime)
						+ " ms for type " + arrtype);*/
	}

}
