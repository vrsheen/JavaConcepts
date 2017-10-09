package interviewQues;

public class FirstNonRepeatCharMet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mytext="stringsaplea";
		char[] charText=mytext.toCharArray();
		int charlength=charText.length;
		boolean firstcharfound=false;
		for (int i = 0; i < charlength; i++) {
			for (int j = i+1; j < charlength; j++) {
					if(charText[j]==charText[i]){
						System.out.println("Repeated char -"+charText[j]+" found at position - "+j);
						firstcharfound=true;
				}
			}
			if (firstcharfound) break;
	}
	}
}
