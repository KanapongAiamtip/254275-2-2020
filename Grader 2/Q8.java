import java.util.Scanner;
public class Q8
{
    public static void main(String[] args)
    {
      
       String str = new Scanner(System.in).nextLine();
       int s =  str == null ? 0 : str.replaceAll("[^,]", "").length();
       System.out.println(s);

    }
}
