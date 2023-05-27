package chap06;

public class Book3 {
	private String title;
	private int price;
	Book3() {}
	Book3(String title, int price){
		this.title = title;
		this.price = price;
	}
	String getTitle() {
		return title;
	}
	int getPrice() {
		return price;
	}
	void setTitle(String title) {
		this.title = title;
	}
	void setPrice(int price) {
		this.price = price;
	}
	void printBook3() {
		System.out.println("title : " + title);
		System.out.println("price : " + price);
	}
}
