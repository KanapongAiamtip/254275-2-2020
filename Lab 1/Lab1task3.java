public class Lab1task3
{
public static void main(String [] args)
{
  int firstArg = 0;
		if (args.length == 1)
    {
    		try
        {
        		firstArg = Integer.parseInt(args[0]);
    		}
        catch (NumberFormatException e)
        {
        		System.err.println("Argument " + args[0] + " must be an integer.");
        		System.exit(1);
    		}
		}
    else
    {
			System.err.println("You must have 1 argument.");
      System.exit(1);
		}
		for (int i = 0; i < firstArg; i++)
    {
			System.out.println("Make it bold. Make it happen!");
		}
  }
}
