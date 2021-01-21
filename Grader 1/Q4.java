import java.util.Scanner;
public class Q4
{
	public static void main(String[] args)
  {
		Scanner in = new Scanner(System.in);
	  int count = in.nextInt();
    for (int i = 0; i < count; i++)
    {
      for (int j = 0; j < count; j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
	}
