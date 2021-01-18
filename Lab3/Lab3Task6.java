import java.util.Scanner;
public class Lab3Task6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String text = sc.nextLine();
        System.out.println(text.length());         
        for (int i = 0; i < text.length(); i++)
        {
            char ab = text.charAt(i);
            if (ab == 'a' || ab == 'e' || ab == 'i' || ab == 'o' || ab == 'u')
            {
                System.out.print(ab);
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println(" ");
        for (int j = 0; j < text.length(); j++)
        {
            char ab = text.charAt(j);
            if (ab == 'a' || ab == 'e' || ab == 'i' || ab == 'o' || ab == 'u')
            {
                System.out.print(" ");
            }
            else
            {
                System.out.print(ab);
            }
        }
    }
}
