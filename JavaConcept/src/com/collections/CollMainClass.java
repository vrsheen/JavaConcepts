package com.collections;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class CollMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long strtDt=System.nanoTime();
		try {
	/*	ArrayListTest arrLstObj=new ArrayListTest();
			List<ObjectforFun> arrLst = arrLstObj.genList();
   
			System.out.println("----------------WIthout Sorting");
			arrLstObj.printLst(arrLst);
			System.out.println("----------------WIth Natural Comparable Sorting");
			Collections.sort(arrLst);
			arrLstObj.printLst(arrLst);
			System.out.println("----------------WIth Comparator Sorting");
			Collections.sort(arrLst,new ObjectIdComparator());
			arrLstObj.printLst(arrLst);
			
//			for(int i=0;i<100;i++){
//				arrLstObj.printLst(arrLst);
//			}
	System.out.println("ArrayList took = "+(System.nanoTime()-strtDt)+"*****************");
	
	LinkedListTest lnkLstObj=new LinkedListTest();
	List<ObjectforFun> lnkLst = lnkLstObj.genList();
	    strtDt=System.nanoTime();
				System.out.println("----------------WIthout Sorting");
				lnkLstObj.printLst(lnkLst);
				System.out.println("----------------WIth Natural Comparable Sorting");
				Collections.sort(lnkLst);
				lnkLstObj.printLst(lnkLst);
				System.out.println("----------------WIth Comparator Sorting");
				Collections.sort(lnkLst,new ObjectIdComparator());
				lnkLstObj.printLst(lnkLst);
			
//		for(int i=0;i<100;i++){
//			lnkLstObj.printLst(lnkLst);
//		}
		System.out.println("LinkedList took = "+(System.nanoTime()-strtDt)+"*****************");
		
		*/
		
		HashSetTest hshSetObj=new HashSetTest();
		Set<ObjectforFun> hshSet = hshSetObj.genList();
		    strtDt=System.nanoTime();
					System.out.println("----------------WIthout Sorting");
					hshSetObj.printLst(hshSet);
//					System.out.println("----------------WIth Natural Comparable Sorting");
//					Collections.sort(hshSet);
//					hshSetObj.printLst(hshSet);
//					System.out.println("----------------WIth Comparator Sorting");
//					Collections.sort(hshSet,new ObjectIdComparator());
//					hshSetObj.printLst(hshSet);
				
//			for(int i=0;i<100;i++){
//				hshSetObj.printLst(hshSet);
//			}
			System.out.println("HashSet took = "+(System.nanoTime()-strtDt)+"*****************");
			
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
