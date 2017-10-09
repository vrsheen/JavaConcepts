package concept;

public class MyClass {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sheen";
		String str2="Sheen";
		
		char c='s';
		System.out.println("String comparison ="+str.compareTo(str2));
		
		Integer i = new Integer(10);
		Integer j = i;
		boolean b = (i == j);
		System.out.println(b);
		 
		i = new Integer(10);
		j = new Integer(10);
		b = (i == j);
		System.out.println(b);
		 
		b = i.equals(j);
		System.out.println(b);
		
		Price p=new  Price("Toy", 100);
		Price p1=new  Price("Toy", 100);
		Price p3=p;
		System.out.println("p p1== comp- "+(p==p1));
		System.out.println("p p1Equals comp- "+(p.equals(p1)));
		
//		System.out.println("p p3== comp- "+(p==p3));
//		System.out.println("p p3Equals comp- "+(p.equals(p3)));
		
	/*	String s1=new String("hello");
		String s2=new String("hello");
		
		if(s1.equals(s2)) {
		      System.out.println("s1.equals(s2) is TRUE");
		} 
		if(s1==s2)  { 
		      System.out.println("s1 == (s2) is TRUE");
		}*/
		
	}

}
