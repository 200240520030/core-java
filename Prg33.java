class Student{
private int rollNo;
private String Name;
void set(int rollNo,String Name){
this.rollNo=rollNo;
this.Name=Name;
}
void show(){
System.out.println(rollNo+" "+Name);
}
}
class Prg32{
public static void main(String args[]){
Student e=new Student();
e.set(101,"datta");
e.show();
e.set(103,"vijay");
e.show();
}
}  
