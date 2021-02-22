public class Lab9Task3 
{

    public static void main(String[] args)
    {

        Restaurant restaurant = new Restaurant("Plearn", "99/9 Thapho, Muang", "Phitsanulok", "Thai");

        System.out.println("Place name: " + restaurant.getName());
        System.out.println("Address: " + restaurant.getAddress());
        System.out.println("Province: " + restaurant.getProvince());
        System.out.println("Food type: " + restaurant.getFoodType());

    }

}
