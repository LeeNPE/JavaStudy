package chap06;

public class Code25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student6 s1 = new Student6("Alice", new Score(90, 80));
		Score a = new Score(88, 93);
		Student6 s2 = new Student6("Bob", a);
		Student6 s3 = new Student6();
		Score b = new Score(78, 70);
		s3.setName("Paul");
		s3.setScore(b);
		s1.incScore(3, 5);
		s1.printStudent6();
		s2.printStudent6();
		s3.printStudent6();
	}

}
