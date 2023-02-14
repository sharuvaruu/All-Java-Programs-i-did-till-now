import java.util.Scanner;
class ReverseCalculator{
    public static void main(String args[])
    {
    int num=0;
    int rev=0;
    int r=0;
    System.out.println("Enter the Number: ");
    Scanner sc= new Scanner(System.in);
    num=sc.nextInt();
    int t=num;
     while( num!=0 )
    {
        rev=rev*10;
        r=num%10;
        rev=rev+r;
        num=num/10;
    }
    System.out.println("Reverse of  "+t+"  is"+rev);
}
}