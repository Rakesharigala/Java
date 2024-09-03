package javaprojectfirstpackage;

public class Number_of_time_helloWorld {
	void number_of_hello(int Times) {
		for (int i = 1; i <= Times; i++) {
			System.out.println("hello world");
		}
	}

	void print_number(int end_number) { 
		for (int i = 1; i <= end_number; i++) {
			System.out.println(i);
		}
	}

	void print_Square_number(int last_numbr) {
		for (int i = 1; i <= last_numbr; i++) {
			System.out.println("Square of::" + i + "=" + (i * i));
		}
	}
	void Multiplication_Table(int Number)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Number+"*"+i+"="+(Number*i));
		}
	}
	void Multiplication_Table()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(5+"*"+i+"="+(5*i));
		}
	}
	void sum(int a,int b)
	{
		System.out.println("Sum of a and b::"+(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Number_of_time_helloWorld obj = new Number_of_time_helloWorld();
		obj.number_of_hello(5);
		obj.print_number(12);
		obj.print_Square_number(5);
		obj.Multiplication_Table(6);
		obj.Multiplication_Table();
		obj.sum(3, 4 );
	}
	

}
