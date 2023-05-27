package chapThread;

public class Code02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable d1 = new Data("th1");
		Thread t1 = new Thread(d1);
		Runnable d2 = new Data("th2");
		Thread t2 = new Thread(d2);
		t1.start();
		t2.start();
	}

}
