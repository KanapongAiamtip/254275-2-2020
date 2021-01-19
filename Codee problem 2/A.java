import java.util.Scanner;
public class A
{
    public static void main(String ... args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double summation = (365.25 * a) / 224.70;
        System.out.printf("%.2f\n", summation);
//      System.out.println(String.format("%.2f", summation));
    }
}
