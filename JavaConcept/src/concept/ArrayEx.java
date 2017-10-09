package concept;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//------------------------Array
/*		int[] a=new int[10];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		a[6]=7;
		a[7]=8;
		a[8]=9;
		a[9]=10;
		
		for(int b:a){
//			System.out.println(b);
		}
		
		char s[]=new char[3];
		s[0]='A';
		s[1]='B';
		s[2]='b';
		for(char sout:s){
			System.out.println(sout);
		}*/
		
		//--------------String and String buffer
/*		long startTime;
		StringBuffer sb= new StringBuffer("Java");
		startTime=System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			sb.append("-append");
		}
		System.out.println("Time taken for StringBuffer=" +(System.currentTimeMillis()-startTime)+" ms");
		
		String st= "Java";
		startTime=System.currentTimeMillis();
		for(int j=0;j<10000;j++){
			st=st+"-append";
		}
		System.out.println("Time taken for Stringappend=" +(System.currentTimeMillis()-startTime)+" ms");
*/
		
		//----------------String to Char ascii
		String st1="Java";
		System.out.println("Length of string ="+st1.length());
		char ch;
		for(int i=0;i<st1.length();i++){
			System.out.println("Ascii values of "+st1.charAt(i)+" is "+ (int)st1.charAt(i));
		}
		
		//--------------
		Integer i =new Integer(10);
		System.out.println(i.toString());
		
		Boolean b1=new Boolean("Left");
		Boolean b2=new Boolean("true");
		Boolean b3=new Boolean("false");
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
		//--------
		Integer i1=Integer.valueOf("1111",10);
		System.out.println(i1);
		
		//-----------
		byte b=-128;
		System.out.println(b);
		
		String a="sf";
		
	}
}
