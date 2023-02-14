class Pen{
    String colour;
    String type;

public void write()
{
    System.out.println("Writing something");
}
public void printcolor()
{
    System.out.println(this.colour);
}

}
class Student{
    String Name;
    int age;
    public void printinfo()
    {
       System.out.println(this.Name);
       System.out.println(this.age);
    }
    Student(Student s2)
    {
       this.Name= s2.name;
       this.age=s2.age;
    }
    Student()
    {
     
    }
}

public class OOPS{

public static void main(String args[])
{
    Pen pen1=new Pen();
    pen1.colour="Pink";
    pen1.type="gel";
    pen1.write();
    Pen pen2= new Pen();
    pen2.colour="Red";
    pen2.type="ball";
    pen1.printcolor();
    pen2.printcolor();
    Student s1= new Student(); // new keyword allocates memory in heap
    s1.name= "sharu";
    s1.age = 19;
    Student s2= new Student(s1);
    s2.printinfo();
}
}