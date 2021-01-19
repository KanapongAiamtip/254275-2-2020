public class Fraction5
{
    public int top;
    public int bottom;
    public Fraction5(int top, int bottom)
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
    public Fraction5 multiply(int multiply)        
    {
		return new Fraction5(top * multiply,bottom);
	}
}
