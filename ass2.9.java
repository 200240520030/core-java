import java.util.Scanner;
class ReverseNum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter no to reverse");
int n=sc.nextInt();
int ar[]=new int[n];
System.out.println("enter elemnt=");
for(int i=0;i<ar.length;i++){
ar[i]=sc.nextInt();
}
System.out.println("Element befor Reverse=");
for(int i=0;i<n;i++){
System.out.println(ar[i]);
}
System.out.println("Element after Reverse=");
for(int i=ar.length-1;i>=0;i--){
System.out.println(ar[i]);
}
}
}



