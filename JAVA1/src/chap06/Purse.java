package chap06;

public class Purse {
	private String owner;
	private Coin coin[];
	Purse() {}
	Purse(String owner, Coin coin[]){
		this.coin = coin;
		this.owner = owner;
	}
	String getOwner() {return owner;}
	Coin[] getCoin() {return coin ;}
	
}
