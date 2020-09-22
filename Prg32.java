class Array17{
 int sum=0;
public static void main(String args[])
{

int a[]={1,2,3};
int b[]={4,5,6};
int c[]={7,8,9};
int d[]={6,7,8};
int e[]={1,2,3,10,11};
int arr[][]=new int[5][];
 arr[0]=a;
 arr[1]=b;
 arr[2]=c;
 arr[3]=d;
 arr[4]=e;
 int sum=0;
for(int ar[]:arr){
sum=0;
for(int h:ar){
sum=sum+h;

}

System.out.print(sum);

System.out.print(" ");
}
}
}


