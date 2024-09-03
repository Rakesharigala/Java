package javaprojectfirstpackage;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner (System.in);
		System.out.print("Enter the table number::");
			int table_number=s.nextInt();
			for(int i=1;i<=10;i++)
			{
				System.out.println(table_number+"*"+i+"="+(table_number*i));
			}
	}

}
