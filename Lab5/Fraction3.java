public class Fraction3
{
    public int top;
    public int bottom;
    public double total;
    public Fraction3(int top, int bottom)
    {
        this.top = top;
        this.bottom = bottom;
    }
    public boolean equals(Fraction3 x) //ALL is f1 and equals with x which is f2 or f3
    {   
        if (top == x.top && bottom == x.bottom)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
