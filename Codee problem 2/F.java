import java.util.Scanner;
public class F
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int pun = 0;
        int word = 0;
        String st = sc.nextLine();
        while (true)// out loop
        {
            if (st.equals("***"))
            {
              break;
            }
            String a2 = st.replaceAll("[\\p{Punct}]", ""); // replace String for catch punctuation mark
            pun += st.length()-a2.length(); // remove pun from word
            String array[] = a2.split(" "); // split  word
            for(int i = 0 ;i<array.length;i++)
            {
                if(array[i].equals("")) // remove Space from word
                {
                    word--;
                }
            }
            word += array.length; // word length
            st = sc.nextLine();
        }
        System.out.print(word + " word");
        if(word>1) // + s if word more than 1
        {
            System.out.print("s");
        }
        System.out.println();
        System.out.print(pun + " punctuation mark");
        if(pun>1) // +s if punctuation more than 1
        {
            System.out.print("s");
        }
    }
}
