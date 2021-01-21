import java.util.Scanner;
public class Q6
{
    public static void main(String[] args)
    {
        int coin_20 = 0;
        int coin_10 = 0;
        int coin_5  = 0;
        int coin_2  = 0;
        int coin_1  = 0;
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        int ch = input2-input1;

        coin_20 = ch/20;
        ch = ch%20;
        coin_10 = ch/10;
        ch = ch%10;
        coin_5 = ch/5;
        ch = ch%5;
        coin_2 = ch/2;
        ch = ch%2;
        coin_1 =ch;
        System.out.println(coin_20+" "+coin_10+" "+coin_5+" "+coin_2+" "+coin_1);

    }
}
