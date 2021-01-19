import java.util.Scanner;
public class Test4 // can run with house.java
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        House h = new House(sc.nextInt(), sc.nextInt());
        System.out.println("My house has " + h.getTotal() + " rooms including " + h.getBedrooms() + " bedrooms and " + h.getToilets() + " toilets.");
    }
}
