import java.util.Scanner;
public class Q7
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String in = sc.nextLine();
    int ins = sc.nextInt();
    if(ins > in.length())
    {
      System.out.println("error");
    }
    else
    {
      System.out.println(in.charAt(ins - 1)); //-1 becase  length lessthan 1
    }
  }
}
