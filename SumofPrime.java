package javaprojectfirstpackage;

public class SumofPrime {

	public static void printEvenNumbers(int n) {
		int sum = 0;
		int i = 0;
		while (i <= n) {
			if (i % 2 == 0) {
				sum = sum+i;
				//System.out.println(sum);
			
			}
			i++;
		}
		System.out.println(sum);
	}

	// System.out.println("kjfjkdsfn"+sum);}
	public static void main(String[] args) {
		SumofPrime obj = new SumofPrime();
		obj.printEvenNumbers(10);
	}

}
