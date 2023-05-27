package chap06;

class Data {
	Data() {};
	int m;
	Data(int x){
		m = x;
	}
	void printData() {
		System.out.println("m : " + m);
	}
}
public class Code09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d1 = new Data();
		Data d2 = new Data(10);
		d1.printData();
		d2.printData();
	}

}
