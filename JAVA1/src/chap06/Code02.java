package chap06;

public class Code02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog happy = new Dog();
		Dog bella = new Dog();
		happy.name = "Happy";
		happy.age = 3;
		bella.name = "Bella";
		bella.age = 2;
		System.out.println("I have two dogs");
		System.out.println("one's dog's name is " + happy.name + ", age is " + happy.age);
		System.out.println("The other dog's name is " + bella.name + ", age is " + bella.age);
	}

}
