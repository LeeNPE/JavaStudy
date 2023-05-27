package chap06;

public class Person {
	static int count;
	String name;
	Person() {
		count++;
	}
	static void printCount() {
		System.out.println(count);
	}
}
