import java.util.Scanner;
class Largnum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter three no");
int num1=sc.nextInt();
int num2=sc.nextInt();
int num3=sc.nextInt();
if(num1>num2 && num1>num3)
{
System.out.println(num1+ " :num1 is larger ");
}
else if(num2>num1 && num2>num3)
{

 System.out.println(num2+ " :num2 is larger ");
}
else
{
System.out.println(num3+ " :num3 is larger ");
}
}
}