import java.util.Scanner;
public class Q6
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String inputs = in.nextLine();
        String[] arrStrOfInputs = inputs.split(" ");
        int[] arrIntOfInputs = new int[arrStrOfInputs.length];
        for (int counter = arrStrOfInputs.length - 1; counter >= 0; counter--)
        {
            arrIntOfInputs[counter] = Integer.parseInt(arrStrOfInputs[counter]);
        }
        for (int c1 = 1; c1 <= 30; c1++)
        {
            boolean control = true;
            for (int c2 = 0; c2 < arrIntOfInputs.length; c2++)
            {
                if (arrIntOfInputs[c2] == c1)
                {
                  control = false;
                }
            }
            if (control == true)
            {
              System.out.print(c1 + " ");
            }
        }
    }
}
