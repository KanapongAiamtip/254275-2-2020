import java.util.Scanner;
public class Q15
{
   public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      String word[] = in.nextLine().split(",");
      for(int i = 0; i<word.length; i++)
      {
         for (int j = i; j<word.length; j++)
         {
            if(word[i].compareTo(word[j])>0)
            {
               String temp = word[i];
               word[i] = word[j];
               word[j] = temp;
            }
         }
      }
      for(int x =0; x<word.length; x++)
      {
        if(x<word.length-1)
        {
         System.out.print(word[x]+",");
        }
        else
        {
         System.out.print(word[x]);
        }
      }
   }
}
