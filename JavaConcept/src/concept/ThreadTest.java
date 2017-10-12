package concept;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread(new ClassforThread());
		t.start();
		t.interrupt();
		System.out.println("Thread interrupt called");
	}

}
