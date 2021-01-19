import java.util.Scanner;
public class C
{
    public static void main(String ... args)
    {
        Scanner sc = new Scanner(System.in);
        int multiples  = sc.nextInt();
        int ab =7;
        for (int i = 1; i <= multiples; i++)
        {
          System.out.print( i*ab+", ");  
        }

    }

}
