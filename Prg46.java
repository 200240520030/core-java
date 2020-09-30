class cal{
private int num;
cal(){
this(32);
System.out.println("no argument super constructor");
}
cal(int Num){
System.out.println(" argument super constructor");
}
}
class Math extends cal{
Math(){
System.out.println("no argument subclass constructor");
}
Math(int Num,float length){
System.out.println("argument subclass constructor");
}
}
class Prg46{
public static void main(String args[]){
cal L=new cal();
Math m=new Math(23,13.3f);
}
}


