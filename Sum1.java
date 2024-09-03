package javaprojectfirstpackage;

public class Sum1 {
public static void sumNumbers(int n) { 
    int sum=0;
    while(n>=0){
     sum +=n;
     n--;
    }
	System.out.println(sum);
	}
	
    public static void main(String [] args){
       // Scanner sc=new Scanner(System.in);
    	Sum1 obj=new Sum1();
        obj.sumNumbers(6);
    }
    
}