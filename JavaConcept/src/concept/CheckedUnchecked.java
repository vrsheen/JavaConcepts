package concept;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedUnchecked {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		PrintWriter pw=new PrintWriter("sheenwreer.txt");
		pw.println("Sample text document");
		pw.flush();

	}

}
