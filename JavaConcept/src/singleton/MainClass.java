package singleton;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SingleTonClass singObj1=SingleTonClass.getSingleTonClass();
		System.out.println(singObj1.hashCode());
		
		SingleTonClass singObj2=SingleTonClass.getSingleTonClass();
		System.out.println(singObj2.hashCode());
	}

}
