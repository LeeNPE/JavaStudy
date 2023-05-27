package chapCollectionsFramework;
import java.util.*;
public class Code06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Character> words = new HashMap<Integer, Character>();
		for(int i = 0 ; i < 10 ; i++) {
			char ch = (char)(i+65);
			words.put(i,ch);
		}
		for(int i = 0 ; i < words.size() ; i++)
			System.out.println(words.get(i));
		Scanner userIn = new Scanner(System.in);
		int i = userIn.nextInt();
		System.out.println(words.get(i));
		userIn.close();
	}
}
