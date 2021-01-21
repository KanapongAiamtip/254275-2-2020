import java.util.Scanner;
public class Q9
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int ct4in = 0;                                                          
        int ct4in2 = input;                                                     
        for (int row1 = input - 1; row1 > -1; row1--) 
        {                       
            for (int hrow = 0; hrow < row1 ; hrow++) 
            {
                System.out.print(" ");
            }   
            System.out.print("/");                                              
            ct4in++;
            for (int in1 = 1; in1 < ct4in; in1++) 
            {
                System.out.print(" ");
            }     
            for (int in2 = 1; in2 < ct4in; in2++) 
            {
                System.out.print(" ");
            }      
            System.out.print("\\");                                             
            System.out.println();                                               
        }
        for (int row2 = 0; row2 < input; row2++) 
        {                              
            for (int llow = 0; llow < row2; llow++) 
            {
                System.out.print(" ");
            }   
            System.out.print("\\");                                             
            ct4in2--;
            for (int inl1 = ct4in2; inl1 > 0; inl1--) 
            {
                System.out.print(" ");
            }  
            for (int inl2 = ct4in2; inl2 > 0; inl2--) 
            {
                System.out.print(" ");
            }  
            System.out.print("/");                                              
            System.out.println();                                             
        }
    }
}
