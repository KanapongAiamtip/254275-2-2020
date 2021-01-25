public class Lab6Task6 {
    public static void main(String[] args) 
    {
        int [] a  = {5,3,8,8};
        double[] b = { 2.3, 5.4, 7.1, 9.6 };
        System.out.println(" sum int and double is " + Calculator.sum(a,b));
        System.out.println(" sum double and int is " + Calculator.sum(b,a));    
    }
}
