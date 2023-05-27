package chap06;

public class Coin {
	private int value;
	private int count;
	Coin() {}
	Coin(int value, int count){
		this.value = value;
		this.count = count;
	}
	int getCount() {return count;}
	int getValue() {return value;}
	void setCount(int count) {this.count = count;}
	void setValue(int value) {this.value = value;}
	
}
