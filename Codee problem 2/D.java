import java.util.Scanner;
public class D 
{
    public static void main(String[] args) 
      {
        Scanner in = new Scanner(System.in);
             int [] num = new int[4];
             for(int i=0;i<4;++i)
             {
              num[i] = in.nextInt(); 
             }          
             min(num);
      }
      public static void min(int a[]) 
      {             
        int min = a[0];                         
        for(int i=0;i<4;++i) 
        {
          if(min>a[i])                     
          min=a[i];                
        }
        System.out.println(min);
      }
}


