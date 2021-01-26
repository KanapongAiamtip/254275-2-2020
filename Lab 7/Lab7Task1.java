public class Lab7Task1
{
    public static void main(String[] args)
    {
        Product tea1 = new Product("Thai Iced Tea", 35.0);
        Product tea2 = new Product("English Breakfast Tea", 45.0);
        System.out.println("tea1:" + tea1.getName() + ", " + tea1.getPrice());
        System.out.println("tea2:" + tea2.toString());
        Product teaX = new Product("Thai Iced Tea", 35.0);
        if (tea1.equals(teaX))
        {
            System.out.println("tea1 and teaX are the same");
        }
    }

}
