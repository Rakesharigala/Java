package javaprojectfirstpackage;

import java.util.Scanner;

public class Equilateral_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the angle 1=");
		int angle_1 = s.nextInt();
		System.out.print("Enter the angle 2=");
		int angle_2 = s.nextInt();
		System.out.print("Enter the angle 3=");
		int angle_3 = s.nextInt();
		int sum = angle_1 + angle_2 + angle_3;
		if (sum == 180) {
			System.out.println("The Triangle is a Equilateral Triangle");
		} else {
			System.out.println("This is not a Eqilateral Traingle ");
		}

	}

}
