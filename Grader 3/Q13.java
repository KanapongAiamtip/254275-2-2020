import java.util.Scanner;

public class Q13
{

  public static void main(String[] args)
  {
    int[] nums = intArray();
    boolean  result = arrayOneTwoThree(nums);
    System.out.println(result);
  }
  private  static int[] intArray()
  {
    Scanner reader = new Scanner(System.in);
    String input = reader.nextLine();
    String[] parts = input.split(",");
    int[] result = new int[parts.length];
    for (int i = 0; i < parts.length; i++)
    {
      result[i] = Integer.parseInt(parts[i]);
    }
    return result;
  }
      private  static boolean arrayOneTwoThree(int[] nums)
      {
         for(int i = 0; i < nums.length; i++)
         {
           if(nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3)
           {
             return true;
           }
         }
         return false;
       }
}
