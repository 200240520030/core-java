class Person{

}

class Employee extends Person{

}
class Maneger extends Employee{

}
class Managar extends Employee{

}
class Prg47{
public static void main(String args[])
{
Employee E=new Employee();
System.out.println( E instanceof Person); 
System.out.println( E  instanceof Employee); 
System.out.println( E instanceof Managar); 
}
}

