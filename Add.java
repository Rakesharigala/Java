package javaprojectfirstpackage;

public class Add {
	public static void main (String[] args) {
		int a=12;
    System.out.println(((Object)a).getClass().getSimpleName());
    System.out.println(a);
    byte b=(byte) a;
    System.out.println(((Object)b).getClass().getSimpleName());
    System.out.println(b);
	}
}
