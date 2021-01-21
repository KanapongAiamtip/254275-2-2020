import java.util.Scanner;
public class Q11
{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    int keyboard;
    int max = 0;
    int secondmax = 0;
    do
    {
        keyboard = kb.nextInt();
        if (max <= keyboard)
        {
            secondmax = max;
            max = keyboard;
        }
        else if (secondmax < keyboard)
        {
            secondmax = keyboard;
        }

    }
    while (keyboard != -1);

   System.out.println(max);
   System.out.println(secondmax);
  }
}
