package chap06;

public class Student2 {
	int no;
	String name;
	double score;
	Student2() {}
	Student2(int n) {
		no = n;
	}
	Student2(int n ,String nm) {
		no = n;
		name = nm;
	}
	Student2(int n ,String nm, double s) {
		no = n;
		name = nm;
		score = s;
	}
	void printStudent() {
		System.out.println("no : " + no + " , name : " + name + " , Score : " + score);
	}
}
