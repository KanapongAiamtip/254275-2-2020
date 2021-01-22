import java.util.Scanner;
public class Q8
{

  public static void main(String[] args)
  {
     int[] nums = intArray();
     String  result = Decreased(nums);
     System.out.println(result);
  }

 private static int[] intArray()
 {
     Scanner in = new Scanner(System.in);
     String input = in.nextLine();
     String[] parts = input.split(",");
     int[] result = new int[parts.length];
     for (int i = 0; i < parts.length; i++)
     {
        result[i] = Integer.parseInt(parts[i]);
     }
     return result;
 }
 private  static String Decreased(int[] nums)
 {
   String result = "";
   for(int i =0; i <nums.length; i++)
   {
     if(nums[i]%2==0)
     {
       result += nums[i]+1;
     }
     else
     {
      result += (nums[i]-1);
     }

     if(i<nums.length-1)
     {
       result += ",";
     }

   }
   return result;
 }

}
