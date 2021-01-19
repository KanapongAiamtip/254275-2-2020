import java.util.Scanner;
public class Lab5Task8
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");
        String inputA = sc.nextLine();
        System.out.print("B = ");
        String inputB = sc.nextLine();

        Fraction8 fracA = Fraction8.parse(inputA);
        Fraction8 fracB = Fraction8.parse(inputB);
        Fraction8 result = fracA.add(fracB);
        System.out.println("A + B = " + result.toString());
    }
}
