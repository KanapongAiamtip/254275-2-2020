import java.util.Scanner;
public class Lab4Task2
{
    public static void main(String[] args) 
    {
        Person2 personA = inputPerson();
        Person2 personB = inputPerson();
        if (personA.getAge() == personB.getAge())
        {
            System.out.print(personA.getName() + " and " + personB.getName() + " are the same age");
        }
        else
        {
            System.out.print(personA.getName() + " and " + personB.getName() + " are NOT the same age");
        }
    }
    private static Person2 inputPerson()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        Person2 p = new Person2(name, age);
        return p;
    }
}
