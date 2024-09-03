package javaprojectfirstpackage;


public class Calculator {
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
public int subtract(int a,int b) {

	int c=a-b;
	return c;
	
}
public int multiply(int a,int b) {
	int c=a*b;
	return c;
}
public int divided(int a,int b) {
int c=a/b;
return c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator v=new Calculator();
		int addd=v.add(1, 2);
		System.out.println(addd);
		int sub=v.subtract(10, 5);
		System.out.println("Subtract ="+sub);
		int mu=v.multiply(2, 3);
		System.out.println("Multiply ="+mu);
		int div=v.divided(10, 5);
		System.out.println("div=="+div);
	}

}
