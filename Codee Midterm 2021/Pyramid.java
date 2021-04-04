import java.util.Scanner;
public class Pyramid
{
    private double width;
    private double height;

    public Pyramid(double width ,double height)
    {
      this.width =width;
      this.height = height;
    }
    public double getWidth()
    {
      return width;
    }

    public double getHeight()
    {
      return height;
    }
    public double getVolume()
    {
      return(Math.pow(width, 2)*height/3);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Pyramid x = new Pyramid(sc.nextDouble(), sc.nextDouble());
        System.out.println("Pyramid with width " + x.getWidth()
            + " and height " + x.getHeight() + " has a volume of "
            + String.format("%.2f", x.getVolume()) + ".");
    }
}
