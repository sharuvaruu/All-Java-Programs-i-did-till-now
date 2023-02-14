import java.util.Scanner;
class Calculator{
    public static void main(String args[])
    {
        double n1,n2;
        System.out.println("Enter two numbers :");
        Scanner sc=new Scanner(System.in);
        n1=sc.nextDouble();
        n2=sc.nextDouble();
        System.out.println("Enter operator +,-,*,/ ");
        char op=sc.next().charAt(0);
        double ans=0;
        switch(op){
            case '+':
            ans=n1+n2;
            break;
            case '-':
            ans=n1-n2;
            break;
            case '*':
            ans=n1*n2;
            break;
            case '/':
            ans=n1/n2;
            break;
            default:
            System.out.println("Invalid choice");
            break;
        }
        System.out.println("The Answer is :");
        System.out.println(n1+" "+op+" "+n2+"="+ans);
        

        }

            
    }
