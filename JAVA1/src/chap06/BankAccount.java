package chap06;

public class BankAccount {
	String name;	//고객명
	double balance;	//계좌잔고
	static int count;//고객 수
	BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
		count++;
	}
}
