public class Lab6Task3 
{
    public static void main(String[] args)
    {
        int[] numbers = { 2, 5, 7, 8 };
        double[] number2 = { 9.2, 4.5, 6.9 };
        int sum = Calculator3.sum(numbers);
        System.out.println("sum int is " + sum);
        System.out.println("sum double is " + Calculator3.sum(number2));
    }
}
