public class Lab5Task4
{
    public static void main(String[] args) 
    {
        Fraction4 frac = new Fraction4(3,6);
        System.out.println(frac.toString() + " = " + frac.toDouble());
        frac.simplify();
        System.out.println(frac.toString() + " = " + frac.toDouble());
    }
}
