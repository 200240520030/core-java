import java.util.Scanner;
public class SearchEl
{
    public static void main(String[] args) 
    {
        int n, key;
 boolean flag =false;
 int i = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the element you want to find:");
        key = s.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] ==key)
            {
                flag = true;
                break;
            }
            else
            {
                flag = false;
            }
        }
        if(flag==true)
        {
            System.out.println("Element found at position:"+(i + 1));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
