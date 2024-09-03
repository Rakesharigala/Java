package opps;

 class Car {
void vehicle()
{
	System.out.println("class of car");
}
}
class nano extends Car{
	void nadetails()
	{
		System.out.println("this is nano");
	}
}
class nexa extends Car{
	void nedetails() {
		System.out.println("this is nexa");
	}


public static void main(String []args) {
	nexa n=new nexa();
	n.vehicle();
	n.nedetails();
	//n.nadetails();
	
}
}