public class Lab7Task3 
{
    public static void main(String[] args) 
    {
        Shop cafe = setupShop();

        cafe.placeOrder(2, 1);
        cafe.placeOrder(3, 4);
        cafe.placeOrder(0, 4);
        cafe.placeOrder(3, 2);
        cafe.completeOrder(0);
        cafe.printOrders();
    }

    private static Shop setupShop() 
    {
        Product coffee1 = new Product("Expresso", 35.0);
        Product coffee2 = new Product("Cappucino", 40.0);
        Product coffee3 = new Product("Mocha", 45.0);
        Product tea1 = new Product("Thai Iced Tea", 40.0);
        Product tea2 = new Product("Iced Green Tea", 45.0);
        Product[] menu = { coffee1, coffee2, coffee3, tea1, tea2 };
        return new Shop(menu);
    }
}
