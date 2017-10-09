package concept;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//***********All below can also be used with + or {n} or [A-Z] or [a-z] or [0-9] for fine tuning to desired pattern
//		\d Represent any number  
//		\D represent anything but number
//		\s represent any space
//		\S represent anything but space
//		\w any char
//		\W anything but char
//		. anything
//		+ to have more than 1 grouped
// ***********Repetition
//		{n}- Number of times - for number or char	
//		? 0 or 1 repetition
//		* 0 or more repetition
//************Escape Characters		
//		\e Escape
//		\f Form feed
//		\n Newline
//		\r Carriage return
//		\t Tab
//		\"
//		\'
//		\\
		String str="This is a Test class12 for Regex using mail id vrsheen@gmail.com for contact";
//		Pattern ptrn=Pattern.compile("\\w[a-z]@\\w[a-z].\\w{3}");
		Pattern ptrn=Pattern.compile("\\w+@\\w+[a-z].\\w{3}"); //email
		Matcher ptrnMatcher=ptrn.matcher(str);
		
		while(ptrnMatcher.find()){
			if(ptrnMatcher.group().length()>0){
				System.out.println(ptrnMatcher.group().trim());
			}
			System.out.println(ptrnMatcher.start() +" - "+ptrnMatcher.end());
			 
		}
	}

}
