import java.util.Scanner;
public class C
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        String keep[] = number.split(",");
        int a[] = new int[keep.length];
        for (int i = 0; i < keep.length; i++)
        {
            a[i] = Integer.parseInt(keep[i]);
        }
        System.out.println(isAllEqual(a));
    }
      public static boolean isAllEqual(int[] a)
      {
        for(int i=1; i<a.length; i++)
        {
            if(a[0] != a[i])
            {
                return false;
            }
        }
        return true;
      }
}
