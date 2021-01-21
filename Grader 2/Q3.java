import java.util.Scanner;
public class Q3
{
     public static void main(String ... args)
     {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        if(x < y)
        {
          for(int i=x+1; i<y; i++)
          {
            if(i<y-1)
            {
              System.out.print(i+",");
            }
            else
            {
              System.out.print(i);
            }
          }
        }
        else
        {
          for(int i=y+1; i<x; i++)
          {
            if(i<x-1)
            {
              System.out.print(i+",");
            }
            else
            {
              System.out.print(i);
            }

          }
        }
    }
}
