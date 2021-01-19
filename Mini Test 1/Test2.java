import java.util.Scanner;
public class Test2 
{

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String x = kb.nextLine();
        String y = kb.nextLine();
        if (x.length()==y.length())
        {
            System.out.println("EQUAL");
        }
        else
        {
            System.out.print("NOT EQUAL");
        }

    }
}
