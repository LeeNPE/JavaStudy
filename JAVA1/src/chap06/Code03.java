package chap06;

public class Code03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();
		s1.no = 10;
		s1.name = "Alice";
		s1.score = 92.5;
		s2.no = 20;
		s2.name = "David";
		s2.score = 88.2;
		s1.printStudent();
		s2.printStudent();
		System.out.println("------------------");
		s1.updateScore(2.3);
		s2.updateScore(-1.5);
		s1.printStudent();
		s2.printStudent();
	}

}
