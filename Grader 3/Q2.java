import java.util.Scanner;
public class Q2
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String names = "";
        while (true)
        {
            names += "," + in.nextLine();
            if (names.contains("***"))
            {
              break;
            }
        }
        String[] arrOfNames = names.split(",");
        for (int c = arrOfNames.length-2; c > 0; c--)
        {
          System.out.println(arrOfNames[c]);
        }
    }
}
