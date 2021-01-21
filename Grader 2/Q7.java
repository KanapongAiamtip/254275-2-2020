import java.util.Scanner;
public class Q7
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int spaceCount = 0;
    for (char c : str.toCharArray())
    {
        if (c == ' ')
        {
             spaceCount++;
        }
    } 
    System.out.println(spaceCount);

  }
}
