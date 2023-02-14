class Rectangle{
    private int length;
    private int breadth;
    public void setl(int length)
    {
        this.length=length;
    }
    public void setb(int breadth)
    {
        this.breadth=breadth;
    }
    public int calculateperim()
    {
        return 2*(length+breadth);
    }
}
public class PerimeterCalculator{
    public static void main(String args[]){
        Rectangle r1=new Rectangle();
        r1.setl(12);
        r1.setb(10);
        int value=r1.calculateperim();
        System.out.println("The perimeter of recatngle is  " + value);
    }
}