package chap07;

class Person {
	private String name;
	private String phone;
	Person() {}
	Person(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	void printPerson() {
		System.out.println("name : " + name);
		System.out.println("phone : " + phone);
	}
}
