import java.util.Scanner;
class Number{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array=");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the element=");
for(int i=0;i<n-1;i++)
{
arr[i]=sc.nextInt();
}
int Gretest=arr[0];
int Smallest=arr[0];
for(int j=1;j<n-1;j++)
{
if(Smallest>arr[j])
{
Smallest=arr[j];
}
if(Gretest<arr[j])
{
Gretest=arr[j];
}
}
System.out.println("Gretest no is="+Gretest);
System.out.println("Smallest no is="+Smallest);
}
}



