import java.lang.Math;
class Mathop{
static int sum;
static void Add(int a, int b)
{
sum=a+b;
System.out.println("Addition is="+sum);
}
static void Sub(int a,int b)
{
int sub=a+b;
System.out.println("substraction  is="+sub);
}
static void Mul(int a,int b)
{
int mul=a*b;
System.out.println("mul is="+mul);

}
static void Power(int a,int b){

System.out.println("power is"+Math.pow(a, b)); 

}
}
class Prg35{
public static void main(String args[]){
Mathop.Add(10,20);
Mathop.Sub(30,20);
Mathop.Mul(8,9);
Mathop.Power(3,2);
}
}
 



