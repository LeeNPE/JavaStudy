package chap06;

public class Code26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coin coin1 = new Coin(500, 4);
		Coin coin2 = new Coin(100, 4);
		Coin coin3 = new Coin(50, 4);
		Coin coin4 = new Coin(10, 4);
		Coin coin[] = { coin1, coin2, coin3, coin4 };
		Purse purse = new Purse("Alice", coin);
		System.out.println(purse.getOwner() + "'s purse's each coin");
		for (Coin c : purse.getCoin())
			System.out.println(c.getValue() + " : " + c.getCount());
		int total = 0;
		for(Coin c : purse.getCoin()) {
			total += c.getValue() * c.getCount();
		}
		System.out.println(purse.getOwner() + "'s purse is total " + total + ".");
		}

}
