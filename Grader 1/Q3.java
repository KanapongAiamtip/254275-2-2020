import java.util.Scanner;
public class Q3
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int result = 1;
      int n = scan.nextInt();
      for (int i = n; i >= 1; i--)
      {
         result *= i;
      }
      System.out.println(result);
   }
}
