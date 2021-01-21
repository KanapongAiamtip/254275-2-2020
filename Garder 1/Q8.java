import java.util.Scanner;
public class Q8
{
  public static void main(String[] args)
  {
    String input = new Scanner(System.in).nextLine().toLowerCase();
    int vowels = 0;
    for(int i = 0; i < input.length(); ++i)
    {
        char ch = input.charAt(i);
          if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u')
          {
            vowels++;
          }
    }
    System.out.println(vowels);
  }
}
