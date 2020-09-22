import java.util.Scanner;
class Strings{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of string");
int n=sc.nextInt();
String s[]=new String[n];
System.out.println("Enter the El of String");
for(int i=0;i<s.length-1;i++)
{
s[i]=sc.nextLine();
}
for(String a:s)
System.out.println(a);
}
}
 