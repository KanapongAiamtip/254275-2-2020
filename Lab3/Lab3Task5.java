public class Lab3Task5
{
  public static void main(String[] args)
  {
      int[] numbers = {5, 9, 12, 7, 14, 3, 2};
      int [] numbers5 = arrayPlus(numbers, 5);
      for (int i = 0; i < numbers5.length; i++)
      {
          System.out.print(numbers5[i] + ", ");
      }
      System.out.println();
      int[] numbers10 = arrayPlus(numbers, 10);
      for (int i = 0; i < numbers10.length; i++)
      {
          System.out.print(numbers10[i] + ", ");
      }
      System.out.println();
  }
   private static  int[] arrayPlus(int[] num1, int num2 )
   {
      int[] num3 = new int[num1.length];
      for(int i = 0; i<num1.length; i++){
        num3[i] = num1[i]+num2;
      }
       return num3;
   }
 }
