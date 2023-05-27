package chap06;

public class Code21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book3 bk = new Book3("Java programming" , 25000);
		bk.printBook3();
		bk.setPrice(27000);//변경자 
		bk.setTitle("Java Programing 2"); //변경자
		System.out.println("title : " + bk.getTitle()); //접근자 
		System.out.println("price : " + bk.getPrice()); //접근자
	}

}
