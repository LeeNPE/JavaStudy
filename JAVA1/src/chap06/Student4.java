package chap06;

public class Student4 {
	int number;
	String name;
	double score;
	Student4() {}
	Student4(int number) {
		this.number = number;
	}
	Student4(int number, String name){
		this(number);
		this.name = name;
	}
	Student4(int number, String name, double score) {
		this(number, name);
		this.score = score;
	}
}
