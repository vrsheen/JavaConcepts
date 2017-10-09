package designPattern.creat.singleton;

public class SingletonObj {
	
	private static SingletonObj obj=new SingletonObj();
	
	private SingletonObj(){
	}

	public static SingletonObj getInstanceObj(){
		return obj;
	}
	
	public void showMessage(){
		System.out.println("Inside Singleton Class"); 
	}
}
