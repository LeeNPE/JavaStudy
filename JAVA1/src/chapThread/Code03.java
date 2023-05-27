package chapThread;

public class Code03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadWork t1 = new ThreadWork("t1");
		ThreadWork t2 = new ThreadWork("t2");
		ThreadWork t3 = new ThreadWork("t3");
		t1.run();
		t2.run();
		t3.run();
		System.out.println("-----");
		t1.start();
		t2.start();
		t3.start();
	}

}
