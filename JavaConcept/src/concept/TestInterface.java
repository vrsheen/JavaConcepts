package concept;

public class TestInterface extends AbstractClass implements I1,I2 {

	
	public void display(){
		TestInterface objt=new TestInterface();
		System.out.println("Display - "+I2.i + super.i);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface objt=new TestInterface();
		objt.display();
	}

}
