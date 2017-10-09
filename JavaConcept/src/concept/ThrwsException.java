package concept;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrwsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try{
		method1();
//		}
//		catch(ArithmeticException e){
//			System.out.println("Exeception Caught at Method1 for "+e.getMessage());
//		} 
	}
	
//--> For Unchecked exception try removing the ArithmeticException catch block and automatically the 
	public static void method1(){
		try{
			int i=5/0;
			method2();
			
		}catch(FileNotFoundException e){
			System.out.println("Exeception Occured for "+e.getMessage());
		}catch(ArithmeticException e){
			System.out.println("Exeception Caught at Method2 for "+e.getMessage());
		} 
	}
	
// -->If the throws is mentioned in method1 then it is enough to handle the FileNotFoundException checked exception 
//	at the calling method1
// -->Try removing throws and you will notice the Compiler error saying to handle it in method2
// --> So my conclusion is throws keyword helps for Checked exceptions to instruct the compiler that exception 
// will be handled in its calling method. For unchecked exception I can catch exception in the actual method method1
// or its calling method.
	public static void method2()throws FileNotFoundException{
		 FileReader file = new FileReader("C:\\test\\a.txt");
	        BufferedReader fileInput = new BufferedReader(file);
	}
}
