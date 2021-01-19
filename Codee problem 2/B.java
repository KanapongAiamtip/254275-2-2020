import java.util.Scanner;
public class B 
{
    public static void main(String ... args) 
    {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		if(str.toLowerCase().equals("mercury")) 
		{
			System.out.println("Mercury is the 1st planet from the Sun.");
		}
		else if(str.toLowerCase().equals("venus")) 
		{
			System.out.println("Venus is the 2nd planet from the Sun.");
		}
		else if(str.toLowerCase().equals("earth")) 
		{
			System.out.println("Earth is the 3rd planet from the Sun.");
		}
		else if(str.toLowerCase().equals("mars")) 
		{
			System.out.println("Mars is the 4th planet from the Sun.");
		}
		else if(str.toLowerCase().equals("jupiter")) 
		{
			System.out.println("Jupiter is the 5th planet from the Sun.");
		}
		else if(str.toLowerCase().equals("saturn")) 
		{
			System.out.println("Saturn is the 6th planet from the Sun.");
		}
		else if(str.toLowerCase().equals("uranus")) 
		{
			System.out.println("Uranus is the 7th planet from the Sun.");
		}
		else if(str.toLowerCase().equals("neptune")) 
		{
			System.out.println("Neptune is the 8th planet from the Sun.");
		}
	}
}
