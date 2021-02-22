public class Circle extends Shape 
{
    private int radius = 0;

    public Circle(String colour, int radius)
    {
        super(colour);
        this.radius = radius;
    }
    public int getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    public String toString()
    {
        return "Circle (" + radius +"): " + super.toString();
    }
}
