import java.util.Scanner;
public class Q14
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String[] arrOfInput = in.nextLine().split(" ");
        int[] intArr = new int[arrOfInput.length];
        for (int counter = arrOfInput.length - 1; counter >= 0; counter--)
        {
            intArr[counter] = Integer.parseInt(arrOfInput[counter]);
        }
        for (int ct = 0; ct <= intArr.length - 1; ct++)
        {
            if (intArr[ct] < intArr[intArr.length - 1])
            {
                System.out.print(intArr[ct] + " ");
            }
        }
    }
}
