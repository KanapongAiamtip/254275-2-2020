import java.util.Scanner;
public class Q5
{

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      boolean prime = true;
      int number = in.nextInt();
      int limit = (int) Math.sqrt(number);
      for (int i = 2; i <= limit; i++)
      {
         if (number % i == 0)
         {
            prime = false;
            break;
         }
      }
      if(prime==true)
      {
        System.out.println("Y");
      }
      else
      {
        System.out.println("N");
      }

   }
}
