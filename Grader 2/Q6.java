import java.util.Scanner;
public class Q6
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int count = in.nextInt();
      int n1=0,n2=1,n3,i;
      if(count>=1)
      {
        System.out.print(1+" ");
      }
      for(i=1;i<count;++i)
      {
        n3=n1+n2;
        System.out.print(n3+" ");
        n1=n2;
        n2=n3;
      }
   }
}
