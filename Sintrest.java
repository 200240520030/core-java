import java.util.Scanner;
class Sintrest{
public static void main (String args[])
{
float R,P,T,SI;
Scanner sc=new Scanner(System.in);
System.out.println("enter a rate");
R=sc.nextFloat();

System.out.println("enter a  principle");
P=sc.nextFloat();

System.out.println("enter a no of years");
T=sc.nextFloat();

SI=(P*T*R)/100;
System.out.println("simple intrest is:"+SI);
}
}





