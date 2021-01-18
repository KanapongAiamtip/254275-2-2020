public class Person4
{
    private String name;
    private int age;
    public Person4(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public String toString()
    {
        return name + " " + ((age));        //Can say as String
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
