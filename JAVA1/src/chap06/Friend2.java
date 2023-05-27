package chap06;

public class Friend2 {
	String name;
	int age;
	Friend2() {}
	Friend2(String n, int a){ //매개변수있는 생성자
		name = n;
		age = a;
	}
	void printFriend2() {
		System.out.println("name : " + name + " , age :" + age);
	}
}
