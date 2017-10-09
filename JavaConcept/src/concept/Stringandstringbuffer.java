package concept;

public class Stringandstringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a ="First";
		a.concat("Last");
		System.out.println("String output ="+a);
		a+="First";
		System.out.println("String output ="+a);
		
		StringBuffer sb=new StringBuffer("First");
		sb.append("Last");
		System.out.println("StringBuffer output ="+sb);
	}

}
