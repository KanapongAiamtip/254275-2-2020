public class Calculator5 {

    
    public static int sum(int[] numbers) 
    {
        int sum = 0;
            for (int i = 0; i < numbers.length; i++) 
            {
                sum = sum + numbers[i];
            }
            return sum;
    }
    
    public static double sum(double[] numbers) 
    {
        double sum = 0;
            for (int i = 0; i < numbers.length; i++) 
            {
                sum = sum + numbers[i];
            }
            return sum;
    }
   
    public static double sum (int[] list1, double[] list2)
    {
        return Calculator5.sum(list1)+Calculator5.sum(list2);
    } 
}
