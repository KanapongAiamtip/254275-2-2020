import java.util.Scanner;

public class Lab9Task6 
{

    public static void main(String[] args) 
    {

        Hotel top = new Hotel("Topland Hotel", "Muang", "Phitsanulok", 1250);

        System.out.println(top.toString());
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("How many nights do you want? ");
        int nights = sc.nextInt();
        System.out.println("Price for " + nights + " nights is " + top.calculatePrice(nights) + " baht per room");
        System.out.println();

        System.out.print("How many rooms do you want? ");
        int rooms = sc.nextInt();
        System.out.println("Total price for " + rooms + " rooms for " + nights + " nights is " + top.calculatePrice(nights, rooms) + " baht");
    }

}
