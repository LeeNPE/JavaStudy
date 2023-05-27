package practice;
import java.util.Random;
public class RandomNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random a = new Random();
		for(int i = 1; i<= 16 ; i++) {
			System.out.print(a.nextInt(0, 9));
		}
	}

}
