public class Person5
{
    private String name;
    private int age;
    public Person5(String name,int age)
    {
        this.name = name;
        this.age = age;
    } 
    public int age()
    {
        return this.age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public boolean equals(Person5 obj)
    {
        if(this == obj) 
        {
            return true; 
        }     
        // it checks if the argument is of the  
        // type Geek by comparing the classes  
        // of the passed argument and this object. 
        // if(!(obj instanceof Geek)) return false; ---> avoid. 
        if(obj == null || obj.getClass()!= this.getClass())
        {
            return false;  
        } 
        // type casting of the argument.  
        Person4 geek = (Person4) obj;     
        // comparing the state of argument with  
        // the state of 'this' Object. 
        return (geek.name == this.name && geek.age == this.age); 
    } 
}
