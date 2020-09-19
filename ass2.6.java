import java.util. Scanner;
class PrimeNo2{
public static void main(String args[]){ 
Scanner sc=new Scanner(System.in);
System.out.println("Enter a two no");
int Num1=sc.nextInt();
int Num2=sc.nextInt();
while(Num1>Num2)
{
boolean flag=false;
for(i=2;i<=Num1/2;i++){
if(Num1%2==0){
flag=true;
break;
}
if(!flag && Num1!==0 && num1!==1)
{
System.out.println("prime numbers are="+Num1);
++Num1;
}
}
}
}

 






