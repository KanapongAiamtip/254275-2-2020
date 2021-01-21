import java.util.Scanner;
public class Q10
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String line = kb.nextLine();
        switch (line)
        {
        case "red":
            System.out.println("That is a colour");
            break;
        case "blue":
            System.out.println("That is a colour");
            break;
        case "green":
            System.out.println("That is a colour");
            break;
        case "black":
            System.out.println("That is a colour");
            break;
        case "white":
            System.out.println("That is a colour");
            break;
        case "yellow":
            System.out.println("That is a colour");
            break;
        default:
            System.out.println("Not a colour");
        }
    }
}
