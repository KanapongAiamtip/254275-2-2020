public class Lab8Task7 
{
    public static void main(String[] args) 
    {
        Shape[] arrSh = new Shape[10];
        for(int i = 0 ; i < arrSh.length ; i++)
        {
            if(i % 3 == 0)
            {
                arrSh[i] = new Rectangle("red", i*2 , i*4);
            }
            else if (i % 3 == 1)
            {
                arrSh[i] = new Circle("black", i+2);
            }
            else
            {
                arrSh[i] = new Cylinder("white", i+2 ,i+3);
            }
        }
        for(int i = 0 ; i < arrSh.length ; i++)
        {
            System.out.println(arrSh[i] + ":area = " + arrSh[i].getArea());
        }
    }    
}
