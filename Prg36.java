import java.util.Scanner;
class Mathoperation{

static void Multiply(int a,int b){
int mul=a*b;

System.out.println("multiplication is="+mul);
}
static void Multiply(float a, float b,float c){
float mul=a*b*c;
System.out.println("multiplication is="+mul);
}

static void Multiply()
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter no of element");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int mul=0;
for(int i=0;i<n;i++){
 mul=mul*arr[i];
System.out.println("multiplication is="+arr[i]);
}
System.out.println("multiplication is="+mul);
}

static void Multiply(int a,double b){
double mul=a*b;
System.out.println("multiplication is="+mul);
}

}
class Prg36{
public static void main(String args[]){
Mathoperation.Multiply(10,20);
Mathoperation.Multiply(10.2f,20.5f,10.3f);
Mathoperation.Multiply();
Mathoperation.Multiply(10,20.5);
}
}




