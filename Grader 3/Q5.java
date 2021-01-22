import java.util.Scanner;
public class Q5
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        String inputs = "";
        while (true)
        {
            inputs += "," + in.nextLine();
            if (inputs.contains("*"))
            {
              break;
            }
        }
        String[] arrOfInputs = inputs.split(",");
        if ((arrOfInputs.length - 2) % 2 == 0)
        {
            for (int c = (arrOfInputs.length - 2) / 2; c <= ((arrOfInputs.length - 2) / 2) + 1; c++)
            {
                System.out.println(arrOfInputs[c]);
            }
        }
        else
        {
            System.out.print(arrOfInputs[(arrOfInputs.length - 1) / 2]);
        }
    }
}
