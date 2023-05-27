package chap06;

class Book2 {
	private String title;
	private int price;
	Book2() {}
	Book2(String title, int price) {
		this.title = title;
		this.price = price;
	}
	void printBook2() {
		System.out.println("title : " + title);
		System.out.println("price : " + price);
	}
}
