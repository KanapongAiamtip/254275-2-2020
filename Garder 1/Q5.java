import java.util.Scanner;
public class Q5
{

    public static void main(String ... args)
    {
      Scanner kn = new  Scanner(System.in);
      int year = kn.nextInt();
      boolean leap = false;
       if(year % 4 == 0)
       {
          if( year % 100 == 0)
          {
            // year is divisible by 400, hence the year is a leap year
            if ( year % 400 == 0)
            {
              leap = true;
            }

            else
            {
              leap = false;
            }
          }
        else
        {
          leap = true;
        }
      }
      else
      {
        leap = false;
      }

      if(leap)
      {
        System.out.println(true);
      }

      else
      {
        System.out.println(false);
      }

   }
}
