package chap06;

public class Friend3 {

		String name;
		int age;
		Friend3(String name , int age ) {
			this.name = name;
			this.age = age;
		}
		void hello() {
			System.out.println("Hello");			
		}
		void printFriend3() {
		this.hello();
		System.out.println(this.name + this.age);
		}

	}
