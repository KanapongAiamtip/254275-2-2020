public class Lab2Task6C
{
    public static void main(String[] args)
    {
        char z = last("programming");
        System.out.print(z);
    }
    private static char last(String wow)
    {
        return wow.charAt(wow.length()-1);
    }
}
