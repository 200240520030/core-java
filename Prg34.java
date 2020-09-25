import java.util.Scanner;
class Circle{
float Area;
int Radious;
final float pi=3.14f;
void init(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter radious");
Radious=sc.nextInt();
}
void cArea(){
Area=pi*Radious;
}
void display(){
System.out.println("area of circle is="+Area);
}
}
class AreaOfc{
public static void main(String args[]){
Circle c=new Circle();
c.init();
c.cArea();
c.display();
}
}


