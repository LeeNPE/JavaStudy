package chap06;

public class Data3 {
	static int x;
	int y;
	Data3(int x, int y) {
		Data3.x = x;
		this.y = y;
	}
	void print() { //non-static method
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
	}
}
