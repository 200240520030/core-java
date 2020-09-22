import java.util.scanner;
class Prg30{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int row[][]=new int[3][]
System.out.println("Enter the no elment in row");
for(int i=0;i<3;i++){
 row=sc.nextInt();
int col[]=new int[][3];
for(int j=0;j<3;j++}
{
col[j]=sc.nextInt();
}
row[i]=col;
}
int sum=0;
for(int i=0;i<row.length;i++){

for(int j=0;j<3;j++){

if(row[i]==row[j]){
sum=sum+row[i]+row[j];
}
}
}
System.out.println("sum is"+sum);
}
}


