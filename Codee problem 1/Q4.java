import java.util.Scanner;
public class Q4
{
  public static void main(String[] args)
  {
      Scanner in = new Scanner(System.in);
      String line = in.nextLine();
      if(line.equalsIgnoreCase("monday"))
      {
        System.out.println("Yellow");
      }
      else if (line.equalsIgnoreCase("tuesday"))
      {
        System.out.println("Pink");
      }
      else if(line.equalsIgnoreCase("wednesday"))
      {
        System.out.println("Green");
      }
      else if (line.equalsIgnoreCase("thursday"))
      {
          System.out.println("Orange");
      }
      else if(line.equalsIgnoreCase("friday"))
      {
        System.out.println("Blue");
      }
      else if(line.equalsIgnoreCase("saturday"))
      {
        System.out.println("Purple");
      }
      else if (line.equalsIgnoreCase("sunday"))
      {
          System.out.println("Red");
      }
  }
}
