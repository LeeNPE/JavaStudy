package practice;
import java.util.Scanner;
public class Prac1 {

	public static void main(String[] args) {
		System.out.println("Start");
		Scanner scin = new Scanner(System.in); 
		String text = scin.next();
		System.out.println("your input : " + text);
		
		
		String result = doBubbleSort(text);
		System.out.println("result: " + result);
		
	}
	
	static String doBubbleSort(String original) {
		char charArray[] = original.toCharArray();
		char sp1, sp2;
		for (int a = 1 ; a <= original.length() ; a++ )	
		{
			for (int n = 0 ; n < original.length() - 1; n++ )
			{
				sp1 = charArray[n];
				sp2 = charArray[n + 1];
				if(sp1 > sp2)
				{
					charArray[n] = sp2;
					charArray[n + 1] = sp1;
				}
			}
		}
		
		return String.valueOf(charArray);

		
	}

}
