package concept;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringReverse sr=new StringReverse();
		String inputstring="Hi Example to test the Recursive of String";
		
		String reversstring=new StringBuilder(inputstring).reverse().toString();
		System.out.println(reversstring);
		
		
		char[] chr=inputstring.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=chr.length-1;i>=0;i--){
			sb.append(chr[i]);
		}
		System.out.println("Reverse string out of chararry loop"+sb);
		
//		String rec=reverseRecursively(inputstring);
		System.out.println("sub "+inputstring.substring(0,inputstring.length()-1));
		String rec1=sr.recurtest(inputstring);
		System.out.println("Recursive - "+rec1);
		
	}
	
	StringBuilder ss=new StringBuilder();
	public String recurtest(String str){
		if(str.length()==0){
			return ss.toString();
		}else{
			ss.append(str.charAt(str.length()-1));
		}
		return recurtest(str.substring(0,str.length()-1));
	}
	
	 public static String reverseRecursively(String str) {

		 System.out.println("["+str.substring(1) +" -- "+ str.charAt(0));
		 System.out.println(str);
	        if (str.length() < 2) {
	            return str;
	        }
	        return reverseRecursively(str.substring(1)) + str.charAt(0);

	    }

}
