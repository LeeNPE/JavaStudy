package chap06;

public class Student {
	int i=0;
	Student() {
		System.out.println("시작");
		i = i+ 1;
		System.out.println(i);
	}
	int no; // 학번 
	String name; // 이름 
	double score; // 성적 
	void printStudent() {
		System.out.println("no : " + no);
		System.out.println("name : " + name);
		System.out.println("score : " + score);
		
	}
	void updateScore(double change) {
		score += change;
		
	}
}
