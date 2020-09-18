import java.util.Scanner;
public class Per{
public static void main(String args[])
{
int math,english,physics,chemistry,marathi;
float sum,per;
Scanner sc= new Scanner(System.in);
System.out.println("enter math marks:");
math=sc.nextInt();

System.out.println("enter marathi marks:");
marathi=sc.nextInt();

System.out.println("enter physics marks:");
physics=sc.nextInt();

System.out.println("enter chemistry marks:");
chemistry=sc.nextInt();

System.out.println("enter english marks:");
english=sc.nextInt();

sum=math+english+physics+chemistry+marathi;
per=(sum/500)*100;
System.out.println("percentage is="+per);
}
}
 