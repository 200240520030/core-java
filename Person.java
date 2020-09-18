import java.util.Scanner;
class Person{
public static void main(String args[])
{
char gender;
int age;
Scanner sc=new Scanner(System.in);
System.out.println("Enter person gender");
 gender= sc.next().charAt(0); 
System.out.println("enter person age");
age=sc.nextInt();

if(gender=='F' && age>=18)
{
System.out.println("female is eligible for marreg");
}
else if(gender=='M' && age>=21)
{
System.out.println("male is eligible for marreg");
}
else
{
System.out.println("both mail and female  is  not eligible for marreg");
}
}
}