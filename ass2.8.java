import java.util.Scanner;
public class Reversen {

    public static void main(String[] args) {
int reversed=0;
        Scanner sc=new Scanner(System.in);
System.out.println("enter no to reverse=");
int num=sc.nextInt();

        while(num != 0) {
            int digit = num % 10;
             reversed= reversed * 10 + digit;
            num /=10;
        }

        System.out.println("Reversed Number: "+reversed);
    }
}