package javaprojectfirstpackage;

public class MethodSub {
	void sub(int a,int b) {
		System.out.println("Sub="+(a+b));
	}
	public static void main(String[] args) {
		MethodSub s=new MethodSub();
		s.sub(30, 15);

	}

}
