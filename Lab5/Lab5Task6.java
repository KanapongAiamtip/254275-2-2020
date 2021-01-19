public class Lab5Task6
{
    public static void main(String[] args) 
    {
        Fraction6 third = new Fraction6(1,3);
        Fraction6 half = new Fraction6(1,2);
        System.out.print(third.toString() + " * " + half.toString());
        Fraction6 result = third.multiply(half);
        result.simplify();
        System.out.print(" = " + result.toString());
        
    }
}
