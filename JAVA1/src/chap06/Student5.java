package chap06;

public class Student5 {
	private String name;
	private int score;
	Student5(String name, int score) {
		this.name = name;
		this.score = score;
	}
	String getName() { return name; }
	int getScore() {return score;}
	void print() {
		System.out.println("(" + name + ")");
	}
}
