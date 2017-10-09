package designPattern.creat.singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Compilation error since , we set constructor private and no new objects of class can be created
//		SingletonObj obj=new SingletonObj();
		
		SingletonObj obj=SingletonObj.getInstanceObj();
		obj.showMessage();
		
	}

}
