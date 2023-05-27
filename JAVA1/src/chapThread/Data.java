package chapThread;
public class Data implements Runnable{
	private int data = 0;
	private String name;
	Data(String name){this.name = name;}
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(name+ "("+ ++data + ")");
		}
	}
	
}