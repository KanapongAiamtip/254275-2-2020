import java.util.Scanner;
public class Lab3Task3
{
    public static void main(String[]args)
    {
        float average1 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Marks: ");
        String input = sc.nextLine();
        String number[] = input.split(" ");
        for (int i = 0; i < number.length; i++)
        {
            average1 = average1 + Float.parseFloat(number[i]);
        }
        float average = average1 / number.length;
        System.out.print("Your average mark is: " + average);
    }
}
