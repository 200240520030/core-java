import java.util.Scanner;
public class SortDsc {    
    public static void main(String[] args) {        
        int n;
int temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of element=");
n=sc.nextInt();

        int [] arr = new int [n];           
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.println(arr[i] + " ");
             arr[i]=sc.nextInt();  
        }    
            
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
   
        System.out.println("Elements of array sorted in descending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.println(arr[i] + " ");    
        }    
    }    
}    


