package opps;

import java.util.*;

public class Bank {
	int balance_amount = 1000;
	int withdraw_amount;
	int deposit_amount;

	void balance_check(int withdraw_amount) {
		String afb = null;
		System.out.println("Balance_amount=" + afb);
	}

	void Withdraw(int withdraw_amount) {
		int afb = balance_amount - withdraw_amount;
		System.out.println("After withdraw balance=" + afb);
	}

	void deposit(int deposit_amount) {
		balance_amount = balance_amount + deposit_amount;
		System.out.println("After deposit balance=" + balance_amount);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Bank c1 = new Bank();
		System.out.print("enter deposit amount=");
		int deposit = s.nextInt();
		c1.deposit(deposit);
		System.out.print("enter amount to withdraw=");
		int withdraw = s.nextInt();
		c1.Withdraw(withdraw);
	}

}
