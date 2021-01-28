public class Fraction7
{
    public int top;
    public int bottom;
    public Fraction7(int top, int bottom)
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
        return (double)top/bottom;
    }
    public int gcd(int top, int bottom)   
    {
        if (bottom==0)
        {
            return Math.abs(top);
        }
        return gcd(bottom, top%bottom);          
    }
    public void simplify()
    {
        int n = gcd(top, bottom);
        top = top/n;
        bottom = bottom/n;
    }
    public Fraction7 add(Fraction7 f2)        //for half = f2 = Fraction2
    {
        int top1;
        int top2;
        int n2;
        top1 = top * 3;
        top2 = top * 2;
        int total = top1 + top2;
        n2 = bottom * f2.bottom;
        return new Fraction7(total,n2);
	}
}
