public class Lab5Task7
{
    public static void main(String[] args) 
    {
        Fraction7 half = new Fraction7(1,3);
        Fraction7 third = new Fraction7(1,2);
        System.out.print(half.toString() + " + " + third.toString());
        Fraction7 result = half.add(third);
        System.out.print(" = " + result.toString());
        
    }
}
