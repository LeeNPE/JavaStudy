package practice;
class Acient {
	int a;
	Acient(){}
	Acient(int a){
		this.a = a;
	}
	void acientMethod() {System.out.println("acientMethod");}
	void overrideMethod(){System.out.println("acient override");}
}
class Father1 extends Acient{
	Father1(){}
	Father1(int a){
		super(a);
	}
	void overrideMethod(){System.out.println("Father1 override");}
	void FatherMethod() {System.out.println("FatherMethod");}
}
class Father2 extends Acient{
	Father2(){}
	Father2(int a){
		super(a);
	}
	void overrideMethod(){System.out.println("Father2 override");}
	void FatherMethod() {System.out.println("FatherMethod");}
}
public class TestExtends1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acient af1 = new Father1(10);
		af1.acientMethod();
		af1.overrideMethod();
		Acient af2 = new Father2(10);
		af2.acientMethod();
		af2.overrideMethod();
	}

}
