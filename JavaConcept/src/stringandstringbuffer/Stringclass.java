package stringandstringbuffer;

public class Stringclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int i=10;
//int e=Integer.parseInt(args[0]);
		
		String a=new String("Sheen ");
		System.out.println(a.concat("Software"));
		System.out.println(a);
		
		StringBuffer b=new StringBuffer("Sheen");
		b.append("Software");
		System.out.println(b);
		
		String s1=new String("Sheen");
		String s2=new String("Sheen");
		String s3=s1;
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
	}

}
