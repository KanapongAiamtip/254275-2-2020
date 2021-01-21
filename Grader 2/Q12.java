import java.util.Scanner;
public class Q12
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int temp = scan.nextInt();
        int x = (temp-1)*2 +1;
        int y = x/2;  // calculate how many spaces you need to print before the stump
        int z = 1;  // initial #of * you need to print
        for(int i=0; i<temp; i++) //determines how many lines you print
        {
            for(int j=0; j<=y; j++) //determines how many spaces you print
            {
                System.out.print(" ");
            }
            for(int k = 0; k<z; k++) // determines how many * you print
            {
                System.out.print("*");
            }
            System.out.println();
            y--;
            z+=2; //add 2 for the 1,3,5,7 increment
        }
        for(int i =0; i<=x/2; i++) //prints the spaces you need until you reach the middle
        {
            System.out.print(" ");
        }
        System.out.println("*");


    }
}
