public class Lab4Task5
{
    public static void main(String[] args) 
    {
        Person4 personA = new Person5("Andrew" , 12);
        Person4 personB = new Person5("Beryl" , 12);
        Person4 personC = new Person5("Andrew" , 12);

        if (personA.equals(personB))
        {
            System.out.println("A and B are the same.");
        }
        if (personA.equals(personC))
        {
            System.out.println("A and C are the same.");
        }
    }
}
