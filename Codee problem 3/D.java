import java.util.Scanner;
public class D 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        String word[] = str.split(",");
        for (int i = 0; i < word.length; i++)
        {
            if (word[i].length() > 6)
            {
                System.out.println(word[i]);
            }
            else
            {
                System.out.print("");
            }
        }
    }
}
