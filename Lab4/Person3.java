public class Person3
{
    private String name;
    private int age;
    public Person3(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public int increaseAge()
    {
        age = age + 1;
        return age;
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
