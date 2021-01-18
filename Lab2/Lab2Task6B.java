public class Lab2Task6B 
{
  public static void main(String args[])
  {
    float y = smallest(4.5,1.2,2.4);
    System.out.println(y);
  }
    private static float smallest(double x,double y,double z)
    {
      if(x<y && x<z)
      {
        return (float)x;
      }  
      else if (y<x && y<z)
      {
        return (float)y;
      }
      else
      {
       return (float)z;
      }
    }
  }
