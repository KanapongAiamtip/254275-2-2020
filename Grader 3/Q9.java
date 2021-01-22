import java.util.Scanner;
public class Q9
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int i = 0;
    String input = "";
    while (in.hasNext())
    {
      input += " " + in.nextLine();
      if(input.contains("***"))
      {
        break;
      }
    }
    String [] x = input.split(" ");
    for (String a : x)
    {
      i++;
    }
    int b=0;
    int c=0;
    for(int a=0;a<i;a++)
    {
      if(x[a].equals("Ping"))
      {
         b++;
         if(a<i-1)
         {
             if(x[a+1].equals("Pong"))
             {
                b--;
             }
         }
       }
       else if(x[a].equals("Pong"))
       {
          c++;
          if(a<i-1)
          {
              if(x[a+1].equals("Ping"))
              {
                c--;
              }
          }
       }
    }
   System.out.println(b+":"+c);
  }
}
