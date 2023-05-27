package chapThread;

public class ThreadWork extends Thread{
	private String name;
	ThreadWork(String name){
		this.name = name;
	}
	Thread work = new Thread();
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		work();
	}
	void work() {
		System.out.println(name + "starts");
		//try {work.sleep(4000);} catch(InterruptedException e) {System.out.println(e);}
		System.out.println(name + "ends");
	
	}
}
