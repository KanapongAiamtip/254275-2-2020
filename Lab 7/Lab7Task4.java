import java.util.Scanner;
public class Lab7Task4 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        Shop cafe = setupShop();

        while (true) 
        {
            switch(getAction(scanner)) 
            {
                case 1:
                    cafe.printOrders();
                    break;
                case 2:
                    int table = getTable(scanner);
                    int productIndex = getProductIndex(scanner, cafe.getMenu());
                    cafe.placeOrder(productIndex, table);
                    break;
                case 3:
                    int orderIndex = getOrderIndex(scanner);
                    cafe.completeOrder(orderIndex);
                    break;
            }   
        }
    }

    private static Shop setupShop() 
    {
      Product coffee1 = new Product("Expresso", 35.0);
      Product coffee2 = new Product("Cappucino", 40.0);
      Product coffee3 = new Product("Mocha", 45.0);
      Product tea1 = new Product("Thia Iced Tea", 40.0);
      Product tea2 = new Product("Iced Green Tea", 45.0);
      Product[] menu = {coffee1, coffee2, coffee3, tea1, tea2};
     return new Shop(menu);
    }

    private static int getAction(Scanner scanner) 
    {
      System.out.println();
      System.out.println("What to do next?");
      System.out.println("1. Print orders");
      System.out.println("2. Place new order");
      System.out.println("3. Complete an order");
      System.out.print("> ");
      int action = scanner.nextInt();
      return action;
    }

    private static int getTable(Scanner scanner) 
    {
      System.out.println("Enter table:");
      System.out.print("> ");
      int table = scanner.nextInt();
      return table;
    }

   private static int getProductIndex(Scanner scanner, Product[] menu) 
   {
      System.out.println("Enter product:");
      for (int i = 0; i < menu.length; i++) 
      {
          System.out.println(i+1 + " " + menu[i]);
      }
      System.out.print("> ");
      int productIndex = scanner.nextInt();
      return productIndex - 1;
   }

   private static int getOrderIndex(Scanner scanner) 
   {
      System.out.println("Enter order #:");
      System.out.print("> ");
      int orderIndex = scanner.nextInt();
      return orderIndex;
   }
}
