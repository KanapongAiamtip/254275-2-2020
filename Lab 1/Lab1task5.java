public class Lab1task5
{
  public static void main(String[] args)
  {
    if (args.length != 2)
    {
      System.out.println("Error!");
      return;
    }
    String name = args[0];
    int number = Integer.parseInt(args[1]);
    for (int i = 0; i < number ; i++)
    {
      System.out.print(name +  " ");
    }
  }
}
