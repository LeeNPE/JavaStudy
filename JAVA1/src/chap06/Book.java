package chap06;

public class Book {
	String title;
	int price;
	Book(String title) {
		this.title = title;
	}
	Book(String title, int price) { 
		this(title);
		this.price = price;
		
	}

}
