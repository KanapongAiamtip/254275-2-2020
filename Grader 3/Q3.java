import java.util.Scanner;
public class Q3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int characters = 0;
        while (true) // it be okay still util  the contition isn't true
        {
            String input = in.nextLine();
            if (input.equals("stop"))  // if the user input stop  out loop
            {
              break;
            }
            characters += input.length();
        }
        System.out.print(characters);
    }
