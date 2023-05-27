package chap06;

public class Code22 {
	static void add(Point2 t1, Point2 t2) {
		Point2 pt = new Point2();
		pt.setX(t1.getX() + t2.getX());
		pt.setY(t1.getY() + t2.getY());
		System.out.println("p1 + p2 : (" + pt.getX() + "," + pt.getY() + ")");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2 p1 = new Point2(1, 3);
		Point2 p2 = new Point2(5, 8);
		System.out.println("p1 : (" + p1.getX() + "," + p1.getY() + ")");
		System.out.println("p2 : (" + p2.getX() + "," + p2.getY() + ")");
		add(p1, p2);
	}

}
