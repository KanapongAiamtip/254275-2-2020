import java.util.Scanner;
public class Q4
{
       private  static void min(int a[])
       {
             int min = a[0];
             for(int i=0;i<4;++i)
             {
                   if(min>a[i])
                   {
                     min=a[i];
                   }
              }
             System.out.println("Min : "+min);
        }
       private  static void max(int b[])
       {
             int max = b[0];
             for(int i=0;i<4;++i)
             {
                   if(max<b[i])
                   {
                     max=b[i];
                   }
              }
              System.out.println("Max : "+max);
        }

       public static void main(String[] args)
       {
             Scanner in = new Scanner(System.in);
             int [] num = new int[4];
             for(int i=0;i<num.length;++i)
             num[i] = in.nextInt();
             min(num);
             max(num);
       }
}
