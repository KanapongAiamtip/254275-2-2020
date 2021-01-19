import java.util.Scanner;
public class Test3 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        for(int i=0;i<x.length();i++)
        {
            System.out.print("=");
        }
        System.out.println();
        System.out.println(x);
        for(int i=0;i<x.length();i++)
        {
            System.out.print("=");
        }
    }
}
