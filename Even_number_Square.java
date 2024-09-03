package javaprojectfirstpackage;

import java.util.Scanner;

public class Even_number_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner (System.in);
		System.out.print("Enter the number end number::");
		int End_number=s.nextInt();
		int sum=0;
		//For (int i=0;i<=End_number;i++)
		for (int i = 1; i <= End_number; i++) {
			if(i%2==0){
		
			System.out.println("Square of::"+i+"="+i*i);
			sum+=i*i;
			System.out.println("Sum of Square numbers upto "+i+" Square ="+sum);
	}
			}

	}
}
