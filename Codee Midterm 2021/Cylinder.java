import java.util.Scanner;
public class Cylinder
{
    private double diameter;
    private double height;

    public Cylinder(double diameter,double height)
    {
      this.diameter=diameter;
      this.height=height;
    }
    public double getDiameter()
    {
      return diameter;
    }

    public double getHeight()
    {
      return height;
    }

    public float getVolume()
    {
      double volume=((Math.PI*((diameter/2)*(diameter/2)))*height);
      return (float)volume;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Cylinder x = new Cylinder(sc.nextDouble(), sc.nextDouble());
        System.out.println("Cylinder with diameter " + x.getDiameter()
            + " and height " + x.getHeight() + " has a volume of "
            + String.format("%.2f", x.getVolume()) + ".");
    }
}
