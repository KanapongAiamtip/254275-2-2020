public class Lab9Task2 
{

    public static void main(String[] args) 
    {

        Place x = new Place("Naresuan University", "99/9 Thapho, Muang", "Phitsanulok");
        Place y = new Place("Naresuan Hospital", "99/9 Thapho, Muang", "Phitsanulok");
        Place z = new Place("Naresuan University", "99/9 Thapho, Muang", "Phitsanulok");

        System.out.println(x.toString());
        System.out.println(y.toString());
        System.out.println(z.toString());

        System.out.println("x == y: " + x.equals(y));
        System.out.println("y == z: " + y.equals(z));
        System.out.println("z == x: " + z.equals(x));
    }

}
