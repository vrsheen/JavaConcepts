package concept;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;

public class CollectionEx {

	long startTime;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> lm=new LinkedHashMap<Integer,String>();
		lm.put(null,"Sheen");
		lm.put(1, "evengi");
		lm.put(null,"sds");

		System.out.println(lm);
		CollectionEx colobj=new CollectionEx();
		Collection<String> colholder;
//		colholder=colobj.Listsample();
//		colobj.ListIterate((List)colholder);
		colobj.LinkedListsample();
//		colobj.vectorsample();
		
//		colobj.HashSetsample();
	}
	
	public Collection Listsample(){
		ArrayList<String> a1=new ArrayList<String>();
		a1.add(null);
		a1.add("Java");
		a1.add("baby");
		a1.add("tv");
		a1.add("washing");
		a1.add(1,"Book");
//		a1.add(5,null);
		
		if((a1.size()%2)==0){
			System.out.println("Even Middle element - "+a1.get((a1.size()/2)-1));
		}else{
			System.out.println(a1.size()/2);
			System.out.println("Odd Middle element - "+a1.get((a1.size()/2)));
		}
		
		
		System.out.println(a1);
		System.out.println(a1.get(2));
		System.out.println("Contains = "+a1.contains("Java"));
		System.out.println("IsEmpty = "+a1.isEmpty());
		System.out.println("Index = "+a1.indexOf("baby"));
		System.out.println("Size = "+a1.size());
		
		startTime=System.currentTimeMillis();
		for(int i=0;i<=100;i++){
			a1.add(i+2,String.valueOf(i));
		}
		System.out.println("Time taken for ArrayList=" +(System.currentTimeMillis()-startTime)+" ms");
		
		System.out.println(a1.get(50));
		
		return a1;
	}
	
	public void LinkedListsample(){
		LinkedList<String> l2=new LinkedList<String>();
		l2.add("Sam");
		l2.add("John");
		l2.add("Ram");
		l2.add("Tracy");
		l2.add(4,"5");
		System.out.println(l2.add(null));
		System.out.println(l2.add(null));
		l2.addFirst("Sheen");
		startTime=System.nanoTime();
		for(int i=0;i<=100;i++){
			l2.add(i+7,String.valueOf(i));
		}
		System.out.println("Time taken for LinkedList=" +(System.nanoTime()-startTime)+" ms");
		
		System.out.println(l2.get(20));
		
		System.out.println(l2);
	}
	
	public void vectorsample(){
		Vector<String> v=new Vector<String>();
		v.addElement("Java");
		v.add("Book");
		
		System.out.println("vector -"+ v);
	}
	
	public void stacksample(){
		Stack<String> v=new Stack<String>();
		v.addElement("Stack1");
		v.add("Stack2");
		
		System.out.println("Stack -"+ v);
	}
	
	public void queuesample(){
		PriorityQueue<String> v=new PriorityQueue<String>();
		v.add("Stack1");
		v.add("Stack2");
		
		System.out.println("PriorityQueue -"+ v);
	}
	
	
	public void HashSetsample(){
		 HashSet<String> hs = new HashSet<String>();
	        //add elements to HashSet
	        hs.add("first");
	        hs.add("second");
	        hs.add("third");
	        hs.add(null);
	        System.out.println(hs.add("fourth"));
	        System.out.println(hs.add(null));
	        System.out.println(hs.add("first"));
	        System.out.println(hs);
	}
	
	public void Iterate(Collection<String> c)
	{
		System.out.println("Iterator Before Iterate -"+c);
		//get and delete
		Iterator<String> itr=c.iterator();
		String curritr;
		while(itr.hasNext()){
			curritr=itr.next();
            System.out.println("Iterating Through - "+curritr);
            if (curritr.equals("tv")){
            	System.out.println(curritr +" Removed");
            	itr.remove();
            }
        }
		System.out.println("After Iterate -"+c);
	}
	
	public void ListIterate(List<String> c)
	{
		System.out.println("ListIterator Before Iterate -"+c);
		//get and delete
		ListIterator<String> itr= c.listIterator();
		String curritr;
		int cntr=0;
		while(itr.hasNext()){
			curritr=itr.next();
			cntr++;
			if (cntr==4){
				System.out.println("Current- "+curritr);
				itr.previous();
				System.out.println("Previous- "+itr.previous());
			}
            System.out.println("Iterating Through - "+curritr);
            if (curritr.equals("tv")){
            	System.out.println(curritr +" Removed");
            	itr.remove();
            }
        }
		System.out.println("After Iterate -"+c);
	}

}
