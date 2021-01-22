import java.util.Scanner;
public class Q18
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int lines = in.nextInt();
        int dotx = in.nextInt();
        int doty = in.nextInt();
        for (int c1 = lines; c1 >= 1; c1--)
        {       //c1 = x point, c2 = y point
            for (int c2 = 1; c2 <= lines; c2++)
            {
                if (dotx == c2 && doty == c1)
                 {
                   System.out.print("X");
                 }
                else
                {
                  System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
