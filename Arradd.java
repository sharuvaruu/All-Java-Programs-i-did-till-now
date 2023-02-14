import java.util.Scanner;
class Arradd{
    public static void main(String args[])
    {   int size,s=0;
        System.out.println("Enter the size of an array:");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int[]arr=new int[size];
        System.out.println("Enter elements of an array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            s=s+arr[i];
        }
        System.out.println(s);

    }
}