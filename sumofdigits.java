package javaprojectfirstpackage;
import java.util.*;
public class sumofdigits {
public static void main(String[] args) {
// Scanner s=new Scanner(System.in);
int n=123;
int r,sum=0;
while(n>0)
{
r=n%10;
sum=r+sum;
n=n/10;
}
System.out.println(sum);
if(sum%2==0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}

        }
} 