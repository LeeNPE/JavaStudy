package chap06;

public class Student3 {
	static int numberOfStudent;
	String name;
	double score;
	Student3() {
		numberOfStudent++;
	}
	Student3(String n , double s){
		numberOfStudent++;
		name = n;
		score = s;
	}
	void print() {
		System.out.println("name : " + name);
		System.out.println("score :  "  + score);
		System.out.println(numberOfStudent);
	}
}
