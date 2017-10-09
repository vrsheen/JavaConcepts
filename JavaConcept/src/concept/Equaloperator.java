package concept;

public class Equaloperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//////////////////////////////////String//////////////////////
		String s1="sheen";
		String s2="sheen";
		System.out.println("Before String == "+(s1==s2)+" with hashcode "+s1.hashCode()+"-"+s2.hashCode());
		s1=s1+"'s";
		s2=s2+"'s";
		System.out.println("After String == "+(s1==s2)+" with hashcode "+s1.hashCode()+"-"+s2.hashCode());
		
		//////////////////////////////////Integer//////////////////////
		int is=9;
		Integer in1=9;
		Integer in2=9;
		Integer in3=new Integer(9);
		Integer in4=new Integer(9);
		
		System.out.println("i1 i2 =="+(in1==in2));
		System.out.println("i1 i2 equals: "+in1.equals(in2));
		
		System.out.println("i1 i3 =="+(in1==in3));
		System.out.println("i1 i3 equals: "+in1.equals(in3));
		
		System.out.println("i4 i3 =="+(in4==in3));
		System.out.println("i4 i3 equals: "+in4.equals(in3));
		

//		Quiz// Answers are below
//		Question 1:
//		Find the output:
		Integer i1 = 1000; Integer i2 = 1000;
		Integer i3 = 10; Integer i4 = 10;
		System.out.println("Ques 1= "+(i1 == i2));
		System.out.println("Ques 1= "+(i3 == i4));
		 
//		Question 2:
//		Find the output:
		Integer x = 400;
		Integer y = x;
		x++;
		System.out.println("Ques 2= "+(x==y)) ;
		 
//		Question 3
//		Find the output:
		Integer xa = 400;
		Integer ya = xa;
		xa++; xa--;
		System.out.println("Ques 3= "+(xa==ya)) ;

//		Question 4
//		Find the output:
		Integer xb = 126;
		Integer yb = xb;
		System.out.println("Ques 4.1= "+(xb==yb)) ;
		xb++; xb--;
		System.out.println("Ques 4.2= "+(xb==yb)) ;
		xb++;yb++;
		System.out.println("Ques 4.3= "+(xb==yb)) ;
		xb++;yb++; //when value exceeds 127 it fails
		System.out.println("Ques 4.4= "+(xb==yb)) ;

		/*****************Quiz-Answer
		Answer 1

		This will print false and true.
		System.out.println(i1 == i2); will print true when i1 and i2 are having same value between -128 to 127 
		and will print false if i1 and i2 are outside -128 to 127 range even though both are same. This is similar 
		to string pool concept, but with a range limit in certain cases.

		Answer 2

		This will print false. Initially both x and y are refering to the same
		object, but then x is incremented which will auto-unbox x to integer 400, 
		does the addition and box it in another wrapper instance and assign to x. 
		So x and y are completely different objects now. 

		Answer 3

		It will print false. Here we are incrementing and decrementing immediately. 
		So first java will do autounboxing, increment x and through autoboxing it wraps 
		it in another object. Then for x--, it again will do autounboxing, decrement x 
		and through autoboxing it wraps it in another object. This is also a new 
		object created by java and hence not same as old one.

		Answer 4

		It will print true. When we assign 100 to x , or any number between -128 and 127,  
		java will not create a different wrapper object but reuse the existing one. First, 
		for x++, java will do autounboxing, increment x and through autoboxing it wraps 
		it in another object. However in the second step, x--, it does the decrement 
		and when creating a object it sees that there is already another object within 
		the range -128 to 127 with the same value, decides to reuse that object and 
		assign that to x. So x and y are same again and will print true. 
*/
	}
}
