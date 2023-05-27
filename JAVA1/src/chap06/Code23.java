package chap06;

public class Code23 {
	static void change(Point2 t) {
		t.setX(10);
		t.setY(33);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2 p = new Point2(2, 7);
		System.out.println("before  : (" + p.getX() + "," + p.getY() + ")");
		change(p);
		System.out.println("after  : (" + p.getX() + "," + p.getY() + ")");
	}

}
