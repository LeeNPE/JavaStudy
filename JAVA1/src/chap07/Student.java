package chap07;

class Student extends Person {
	private int score;
	Student() {}
	Student(String name, String phone, int score) {
		super(name, phone);// 부모생성자 호출
		this.score = score;
	}
	void printStudent() {
		printPerson();//부모클래스의 printPerson 메소드를 사용가능
		System.out.println("score : " + score);
	}
}
