public class Cylinder extends Circle
{
    private int height = 0;

    public Cylinder(String colour, int radius , int height)
    {
        super(colour, radius);
        this.height = height;
    }
    public int getHeight()
    {
        return height;
    }
    public double getArea()
    {
        return 2*Math.PI*getRadius()*height;
    }
    public String toString()
    {
        return "Cylinder (" + getRadius() + ", " + height +"): " + "This shape is " + getColour();
    }
}
