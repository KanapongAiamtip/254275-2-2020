import java.util.Scanner;
public class Cone
{
    private double radius;
    private double height;

    public Cone(double radius,double height)
    {
      this.radius = radius;
      this.height = height;
    }
    public double getRadius()
    {
      return radius;
    }
    public double getHeight()
    {
      return height;
    }
    public double getVolume()
    {
      return ((Math.PI)*(radius*radius)*height)/3;
    }



    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Cone x = new Cone(sc.nextDouble(), sc.nextDouble());
        System.out.println("Cone with radius " + x.getRadius()
            + " and height " + x.getHeight() + " has a volume of "
            + String.format("%.2f", x.getVolume()) + ".");
    }
}
