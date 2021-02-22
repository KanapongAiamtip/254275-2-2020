public class Lab9Task4 
{

    public static void main(String[] args) 
    {

        Restaurant r1 = new Restaurant("Plearn", "99/9 Thapho, Muang", "Phitsanulok", "Thai");
        Restaurant r2 = new Restaurant("Coffee Space", "99/9 Thapho, Muang", "Phitsanulok", "Coffee");

        if (r1.isThaiFood()) 
        {
            System.out.println(r1.getName() + " is Thai food.");
        }

        if (r2.isThaiFood())
        {
            System.out.println(r2.getName() + " is Thai food.");
        }

        if (r1.hasSameFoodType(r2)) 
        {
            System.out.println(r1.getName() + " and " + r2.getName() + " are the same food type.");
        }
        else 
        {
            System.out.println(r1.getName() + " and " + r2.getName() + " are NOT the same food type.");
        }
    }

}
