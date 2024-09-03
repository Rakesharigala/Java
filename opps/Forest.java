package opps;

public class Forest {
	void methodsf()
	{
		System.out.println("hihgkjdksv");
	}
	}
	class animals extends Forest{
		void methodsA()
		{
			System.out.println("this is animals class");
		}
	}
	class trees extends Forest
	{
		void methods()
		{
			System.out.println("this is tree class");
		}
	}
	class birds extends Forest
	{
		void method()
		{
			System.out.println("this is birds class");
		}
	
	

	public static void main(String[] args) {
	 animals a=new animals();
	trees t=new trees();
	birds b=new birds();
	a.methodsA();
	t.methods();
	b.method();
	

	}

}

