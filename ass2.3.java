import java.util. Scanner;
class PrimeNo2{
public static void main(String args[]){ 
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no");
int Num1=sc.nextInt();
System.out.println("Enter a no");
int Num2=sc.nextInt();
while(Num1<Num2)
{
boolean flag=false;
for(int i=2;i<=Num1/2;++i){
if(Num1 % i==0){
flag=true;
break;
}
}
if(!flag && Num1!=0 && Num1!=1)
{
System.out.println("prime numbers are="+Num1);
++Num1;
}
}
}
}

 






