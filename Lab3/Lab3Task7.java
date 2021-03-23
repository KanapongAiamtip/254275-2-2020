import java.util.Scanner;
public class Lab3Task7
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
        String[] arr = inputs.split(",");
        if ((arr.length - 2) % 2 == 0)
        {
            for (int c = (arr.length - 2) / 2; c <= ((arr.length - 2) / 2) + 1; c++)
            {
                System.out.println(arr[c]);
            }
        }
        else
        {
            System.out.print(arr[(arr.length - 1) / 2]);
        }
    }
}
