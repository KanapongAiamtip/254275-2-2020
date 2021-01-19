public class Fraction2
{
    public int top;
    public int bottom;
    public double total;
    public Fraction2(int top, int bottom)
    {
        this.top = top;
        this.bottom = bottom;
    }
    public String toString()
    {
        return top + "/" + bottom;
    }
    public double toDouble()
    {
        return (double)top/bottom;  //total = 1.0*top/bottom; chagne from top(int) to double
    }
}
