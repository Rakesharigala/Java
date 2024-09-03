package opps;

public class Student {
	int id;
	String name;
	static String course="java";
	public static void main(String args[]) {
		Student a=new Student();
		a.id=1;
		a.name="teja";
		System.out.println("a.id="+a.id+"\n"+"a.name="+a.name);
		Student b=new Student();
		b.id=2;
		b.name="Ram";
		System.out.println("b.id="+b.id+"\n"+"b.name="+b.name);
	}
}
