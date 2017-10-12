package interviewQues;

public class FindStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="hello world welcome to Java";
		String str2="welcome";
		System.out.println(str.indexOf(str2, 0)+" - "+str2.length());

		System.out.println(str.indexOf(str2, 0) +"-"+(str.indexOf(str2, 0)+str2.length()));
		System.out.println(str.substring(str.indexOf(str2, 0) , (str.indexOf(str2, 0)+str2.length())));
	}

}
