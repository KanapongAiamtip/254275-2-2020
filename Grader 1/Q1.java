import java.util.Scanner;
public class Q1
{
    public static void main(String ... args)
    {
        Scanner in = new Scanner(System.in);
        int a = new Scanner(System.in).nextInt();
        double summation = (365.25 * a) / 224.70;
        System.out.printf("%.3f\n", summation);
    }
}
