package javaprojectfirstpackage;

import java.util.Scanner;

public class Final_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double INTREST_RATE = 8.5;
		// INTREST_RATE=6.7;The final local variable INTREST_RATE cannot be assigned. It
		// must be blank and not using a compound assignment
		Scanner s = new Scanner(System.in);
		System.out.println("Enter amount=");
		int p = s.nextInt();
		System.out.println("Enter Number of years=");
		int time_years = s.nextInt();
		double Simple_intrest = (p * time_years * INTREST_RATE) / 100;
		System.out.println("Simple_intrest=" + Simple_intrest);
		System.out.println("The total amount that should you gone pay=" + (Simple_intrest + p));
	}

}
