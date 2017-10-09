package singleton;

public class SingleTonClass {

	
	private SingleTonClass(){}
	
	private static class InnerClass{
		private static SingleTonClass objclass=new SingleTonClass();
		
	}
	
	public static SingleTonClass getSingleTonClass(){
		return InnerClass.objclass;
	}
}
