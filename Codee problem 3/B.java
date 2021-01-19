import java.util.Scanner;
public class B {

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String input  = kb.nextLine();
        String []  inputs = input.split(",");
        String  result = longWord(inputs);
        System.out.print(result);
        kb.close();
    }
    private static String longWord(String[]inputss) {
        for (String k: inputss)
        {
            if (k.length() > 6)
            {
              return k;
            }
        }
        return "";
    }
}
