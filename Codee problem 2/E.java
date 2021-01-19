import java.util.Scanner;
public class E 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum=0;
        for (int i = x; i >= 1; i--)
        {   
            sum = sum + i;
        }
        for (int i = x; i >= 1; i--)
        {   
            if (i != 1)
            {
                System.out.print(i + " + ");
            }
            else if (i == 1)
            {
                System.out.print("1 ");
            }
        }
        System.out.print("= " + sum); 
    }
}