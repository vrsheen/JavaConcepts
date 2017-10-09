package interviewQues;

public class FindStringinAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   String str1 = "Hello world Here I come";
		   String str2 = "me world come";
		   String[] str1Array = str1.split(" ");
		   String[] str2Array = str2.split(" ");
		   boolean found=false;
		   int charsize=str2Array.length;
		   for (int j = 0; j < charsize; j++) {
			   found=false;
			   System.out.println(str2Array[j]);
			   for (int i = 0; i < str1Array.length; i++) {
				   if(str1Array[i].equals(str2Array[j])){
					   System.out.println("The Str Found= "+str2Array[j]+ " is found ");
					   found=true;
					   continue;
			      }
			   }
			   if (found==false){
				   System.out.println("The Str = "+str2Array[j]+ " is not found ");
			   }
		   }
		
	} 
}
