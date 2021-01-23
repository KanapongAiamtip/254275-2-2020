public class Calculator2 
{
    public static double average(int[] numbers) 
    {
        double sum = 0;
        double average =0;
        for (int i = 0; i < numbers.length; i++) 
        {
            sum = numbers[i] + sum;
            average = sum/ numbers.length;
        }
        return average;
    }
}
