public class Calculator4 
{
    public static double sum(double[] numbers) 
    {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < numbers.length; i++) 
        {
            sum = sum + numbers[i];
            average = sum/numbers.length;
        }
        return average;
    }
}
