package practice;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for(int i : a) {
			System.out.print("input Array["+ i + "] : ");
			int in = sc.nextInt();
			a[i] = in;
		}
		for(int i : a)
			System.out.println(a[i]);
	}

}
