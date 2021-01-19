public class Task5
{
    public static void main(String[] args) 
    {
        Fraction5 quarter = new Fraction5(1,4);
        Fraction5 result = quarter.multiply(2);
        result.simplify();
        System.out.println("2 * "+quarter.toString() + " = " + result.toString());
    }
}
