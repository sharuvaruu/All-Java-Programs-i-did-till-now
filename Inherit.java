//single level Inheritance
class Shape{
public double area(){
    return 0;
}
}
class Triangle extends Shape{
    public double area(int l,int h)
    {
      return(1/2*l*h);
    }

}
class Equilateraltriangle extends Triangle{
    public double area(int l,int h)
    {
        return(1/2*l*h);
      
    }
}
public class Inherit{
    public static void main(String args[]){
        Triangle t1= new Triangle();
        System.out.println(t1.area(12,8));
    }
}