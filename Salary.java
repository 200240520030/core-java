import java.util.Scanner;
class Salary{
public static void main(String args[])
{
int BasicSal;
float HA,DA,GrossSal;
Scanner sc=new Scanner(System.in);
System.out.println("Enter basic sal");
BasicSal=sc.nextInt();
if(BasicSal<10000)
{

HA=(BasicSal/10000)*10;
System.out.println(HA);
DA=(BasicSal/10000)*90;
GrossSal=(BasicSal+DA+HA);
System.out.println("grosssal is="+GrossSal);
}
else
{
DA=(BasicSal/10000)*98;
GrossSal=(BasicSal+DA+2000);
System.out.println("grosssal is a="+GrossSal);
}
 }
}