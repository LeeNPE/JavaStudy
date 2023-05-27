package tile2;
import java.util.Scanner;
class TestObject{
}
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TileField t = new TileField(50, 50);
//		Square s = t.Field()[0][0];
//		System.out.println(s);
//		Square s1 = t.getSquare(0, 10);
//		System.out.println(s1);
//		s1.setContent(new TestObject());
//		System.out.println(s1);
//		System.out.println(t.getOtherSquare(t.Field()[0][0],5, 5));// 문제의 원인이 아마 모든 Square안의 객체가 testObj이여서 인듯 함.
//		t.printTile();
//		System.out.println(t.getSurrondCount(3, 2));
//		t.getSquare(3, 3).setState(Square.LIVE);
//		t.getSquare(2, 1).setState(Square.LIVE);
//		System.out.println(t.getSurrondCount(3, 2));
//		t.printTile();
		testLive();
		GameOfLifeRun g = new GameOfLifeRun(50, 75);
		g.randomStart();
		 Scanner sc = new Scanner(System.in);
		int answer;
		do{
			answer = sc.nextInt();
			g.runTurn();
		}while(answer == 0);
		sc.close();
	}
	
	public static void testLive() {
		TileField tf = new TileField(5, 5);
		
		Square[][] squareArray = tf.getField();
		
		squareArray[3][3].setState(true);
		squareArray[3][4].setState(true);
		squareArray[4][3].setState(true);
		
		System.out.println("4, 4 should be true = " + tf.live(4, 4));
		System.out.println("0, 2 should be true = " + tf.live(0, 2));
		System.out.println("0, 3 should be false = " + tf.live(0, 3));
		System.out.println("1, 3 should be false = " + tf.live(1, 3));
		System.out.println("1, 2 should be born = " + tf.live(1, 2));
		
	}
}
