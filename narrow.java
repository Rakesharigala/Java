package javaprojectfirstpackage;

public class narrow {
	public static void main (String[] args) {
		int a=12;
    System.out.println(((Object)a).getClass().getSimpleName());
    System.out.println(a);
     float b=a;
    System.out.println(((Object)b).getClass().getSimpleName());
    System.out.println(b);
	}
}
