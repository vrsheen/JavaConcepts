package interviewQues;

public class FirstNonRepeatChar {
		public static void main (String args[]) {
		   String str = "hheelol world";
		   char[] charArray = str.toCharArray();
		   char selectedChar = ' ';
		   int charsize=charArray.length;
		   String revisedString;
		   for (int j = 0; j <= charArray.length; j++) {
			   System.out.println(charArray[j]);
				   revisedString=(str.substring(0, j)).concat(str.substring(j+1, charsize));
			   System.out.println(revisedString);
			   if(!revisedString.contains(Character.toString(charArray[j]))){
		         selectedChar = charArray[j];
		         break;
		      }
		   }
		   System.out.println("The Not Repeat Char= "+selectedChar+ " is found at ="+str.indexOf(Character.toString(selectedChar)));
		} 
}
