package javaprojectfirstpackage;

import java.util.Scanner;

public class Sum_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of a::");
		int a = s.nextInt();
		System.out.print("Enter the value of b::");
		int b = s.nextInt();
		System.out.print("Enter the value of c::");
		int c = s.nextInt();
		System.out.print("Enter the value of d::");
		int d = s.nextInt();
		if ((a + b) > (c + d)) {
			System.out.println("a+b is grater than c+d");
		} else {
			System.out.println("c+d is grater than a+b");
		}

	} 

}
