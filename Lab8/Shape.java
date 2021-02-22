public class Shape 
{
    private String colour;
    
    public Shape(String colour)
    {
        this.colour = colour;
    }    
    public String toString()
    {
        return "This shape is " + colour;
    }
    public String getColour()
    {
        return colour;
    }
    public void setColour(String colour)
    {
        this.colour = colour;
    }
    public double getArea()
    {
        return 0.0;
    }
}
