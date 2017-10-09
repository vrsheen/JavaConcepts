package interviewQues;
import java.util.*;
import java.lang.*;
import java.io.*;
public class SmallestDistinctWindow {

		public static void main (String[] args) {
			//code
		Scanner reader = new Scanner(System.in);
			int numberOfCases = reader.nextInt();
			int[][] cases = new int[numberOfCases][2];
			for(int i = 0; i <numberOfCases; i++){
				for(int n = 0; n<2; n++){
					cases[i][n] = reader.nextInt();
				}
			}
			
			for(int j = 0; j <cases.length; j++){
				int count = 0;
			    int start = cases[j][0];
			    int lastNumber = cases[j][1];
			    
			    while(start <= lastNumber){
			        String startString = Integer.valueOf(start).toString();
			        int length = startString.length();
			        if(startString.charAt(0) == startString.charAt(length-1)){
			        	count++;
			        }
			        start++;
			    }
			    
			    System.out.println(count);
			}
			
			
		}
	}
