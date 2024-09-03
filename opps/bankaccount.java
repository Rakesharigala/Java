package opps;

import java.util.Scanner;

public class bankaccount extends Bank {

 
	int[] arr = { 111, 222, 333, 444, 555 };

	public Boolean check(int accountnumber) {
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == accountnumber) {
				//System.out.println(arr[i]);
				//System.out.println(accountnumber);
				return true;
			}
		}
		return false;
	}
	
    
	public static void main(String[] args) {
		bankaccount acc = new bankaccount();
		Scanner s = new Scanner(System.in);
		System.out.print("enter the accountnumber::");
		int no = s.nextInt();
		Boolean status = acc.check(no);

		if (status == true) {
			System.out.println("accountnumber validation is completed");
			System.out.println("Your accountnumber is ::" + no);

		} else {
			System.out.println("accountnumber is invalid");
		}


	}
}
