package javaprojectfirstpackage;

import java.util.Scanner;

public class Addition {
	public static void main(String args[]) {
		System.out.println(args[0]);
		Scanner s = new Scanner(System.in);
		final int i;

		int i1 = 5 + 7;
		System.out.println(i1);

		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(a + b);
	}

}
