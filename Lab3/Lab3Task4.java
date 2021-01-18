public class Lab3Task4
{
    public static void main(String[]args)
    {
        String[] hello = {"Hello", "Jeremy"};
        System.out.println(last(hello));

        String[] empty = {};
        System.out.println(last(empty));
    }
    private static String last(String[] x)
    {
        if (x.length == 0)
        {
           return null;
        }
        String z = x[x.length - 1];
        return z;
    }
}
