package interviewQues;

public class StringAnagrams {

	int lpcnt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="ABCD";
		char[] chstr=str.toCharArray();
		StringAnagrams 	strAna=new StringAnagrams();
		strAna.getAnag(chstr,0);
	}
	
	public void getAnag(char[] chstr,int str){
		System.out.print(chstr[str]);
		int i;
		for (i = str+1; i !=str; i++) {
			System.out.print(chstr[i]);
			if(i==chstr.length-1){
				i=-1;
			}
			
		}
		
		System.out.println("");
		getAnag(chstr,i+1);
	}

}
