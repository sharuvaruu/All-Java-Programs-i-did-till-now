//Function Overloading in java compile time polymorphism
class Student{
    String Name;
    int age;
    public void printinfo(String Name)
    {
       System.out.println(Name);
    }
    public void printinfo(int age)
    {
       System.out.println(age);
    }
    public void printinfo(String Name,int age)
    {
       System.out.println(Name +" "+age);
    }

}
public class OOPS1{

public static void main(String args[])
{
    Student s1= new Student();
    s1.Name= "sharu";
    s1.age = 19;
    s1.printinfo(s1.age);
    s1.printinfo(s1.Name);
    s1.printinfo(s1.Name,s1.age);
}
}