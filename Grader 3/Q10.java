import java.util.Scanner;
public class Q10
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int vec1 = in.nextInt();
        int vec2 = in.nextInt();
        int[][] arrofvecs = {{vec1},{vec2}};
        if (arrofvecs[0][0] > 0 && arrofvecs[1][0] > 0)
        {
          System.out.print("Quadrant I");
        }
        if (arrofvecs[0][0] < 0 && arrofvecs[1][0] < 0)
        {
          System.out.print("Quadrant III");
        }
        if (arrofvecs[0][0] > 0 && arrofvecs[1][0] < 0)
        {
          System.out.print("Quadrant IV");
        }
        if (arrofvecs[0][0] < 0 && arrofvecs[1][0] > 0)
        {
          System.out.print("Quadrant II");
        }
    }
}
