package javaprojectfirstpackage;

import java.util.Scanner;

public class Even_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("The a number to Number to find it is even or not::");
		int a_number = s.nextInt();
		if (a_number % 2 == 0) {
			System.out.println("The given number is a even number ");
		} else {
			System.out.println("The given number is a non even number");
		}
	}

}
