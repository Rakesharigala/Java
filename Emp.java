package javaprojectfirstpackage;

public class Emp {
	int id;
	String name;

	static String company = "TATA";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(company);
		Emp team1 = new Emp();
		team1.id = 1;
		team1.name = "RAm";
		System.out.println("team1.id=" + team1.id + "\n" + "team1.name=" + team1.name);

		Emp team2 = new Emp();
		team2.id = 10;
		team2.name = "Ravi";
		System.out.println("team2.id=" + team2.id + "\n" + "team2.name=" + team2.name);
	}

}
