//method overloading
class Overload{
    //For Area of triangle
    double area(double h,double b){
        double d=0.5*b*h;
        return d;
    }
    //For Area of circle
    double area(double r)
    {
        double m=3.142*r*r;
        return m;
    }
    public static void main(String args[]){
        Overload o1=new Overload();
        Overload o2=new Overload();
        double k=o1.area(21.33,34.67);
        System.out.println("AREA OF TRIANGLE:"+k);
        double y=o2.area(6.4);
        System.out.println("AREA OF CIRCLE:"+y);
    
    }
}