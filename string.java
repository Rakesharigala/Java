package javaprojectfirstpackage;

public class string {
	public static void main(String[] args) {
		int a = 3;
		int d = 4;
		var sum = a + d;
		String str = """
				line1:%s %d
				line2:%d
				line3
				line4
				line5
				""".formatted("gdc", sum, 5);
		System.out.print(str);
	}

}
