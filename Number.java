package javaprojectfirstpackage;

import java.util.*;

public class Number {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rev=0;
		int rem;		
		while (n!=0) {
			rem=n%10;
			rev=0*10+rem;
			n=n/10;
			System.out.print(rev);
		}
	}
}
