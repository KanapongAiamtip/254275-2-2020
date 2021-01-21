import java.util.Scanner;
public class Q2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    int y = in.nextInt();
    int sum = x/y;
    for(int i=1; i<=sum; i++)
    {
      System.out.println(i*y);
    }
  }
}
