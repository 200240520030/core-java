import java.util.Scanner;
class Swapp{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Two no :");
a=sc.nextInt();
b=sc.nextInt();
a=a*b;
b=a/b;
a=a/b;
System.out.println("values after swapping:" +" "+a+" "+b);
}
}