package chap06;

public class PersonInfo {
	String name;
	int age;
	double height;
	PersonInfo() {}
	PersonInfo(String n, int a, double h) {
		name = n;
		age = a;
		height= h;
	}
	void printAll() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
	}
}
