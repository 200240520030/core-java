import java.util.Scanner;
public class Sum
{
    public static void main(String[] args) 
    {
    int n;
  int i = 0;
  int sumOdd=0;
int sumEve=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
}
 for(i = 0; i < n; i++){
           if(a[i] % 2==0){

           sumEve=sumEve+a[i];
}

    else
        {
          sumOdd=sumOdd+a[i];
}
}

System.out.println("sum of even no="+sumEve); 
System.out.println("sum of odd no is="+sumOdd);
}
}
