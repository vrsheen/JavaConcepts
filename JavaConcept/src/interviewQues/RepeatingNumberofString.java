package interviewQues;

public class RepeatingNumberofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="aaaabbcd";
		StringBuilder stringBuilder=new StringBuilder();
		char[] charr=str.toCharArray();
		int strindex,endindex,cnt;
		for (int i = 0; i < charr.length; i++) {
			strindex=str.indexOf(charr[i]);
			endindex=str.lastIndexOf(charr[i]);
			cnt=(endindex-strindex)+1;
			stringBuilder.append(charr[i]);
			stringBuilder.append(cnt);
			i=endindex;
		}
		System.out.println(stringBuilder.toString());
	}

}
