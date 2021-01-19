public class Fraction8
{
    public int top;
    public int bottom;

    public Fraction8(int top, int bottom) {

        this.top = top;
        this.bottom = bottom;
    }

    public String toString() 
    {
        return top + "/" + bottom;
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public double toDouble() 
    {
        return (double) top / bottom;
    }

    public int gcd(int top, int bottom)
    {
        if (bottom == 0) 
        {
            return Math.abs(top);
        }
        return gcd(bottom, top % bottom);
    }

    public void simplify() 
    {
        int n = gcd(top, bottom);
        top = top / n;
        bottom = bottom / n;
    }

    public Fraction8 add(Fraction8 f2) 
    {
        int tops = top * f2.getBottom() + bottom * f2.getTop();
        int bottoms = bottom * f2.getBottom();
        return new Fraction8(tops, bottoms);
    }

    public static Fraction8 parse(String pp) 
    {
        String[] bk = pp.split("/");
        int[] nn = new int[2];
        for(int i = 0; i < 2; i++) 
        {
            nn[i] = Integer.parseInt(bk[i]); 
        }
        Fraction8 re = new Fraction8(nn[0],nn[1]);
        return re;
    }
    

}
