package abc;
import java.lang.*;

public class dog {
    String name;
    int age;

    public dog()
    {
        name = "Djo";
        age = 6;
    }

    public dog(String name)
    {
        this.name = name;
        age = 1;
    }

    public  dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void turnIntoHumanAge()
    {
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }

    @Override
    public String toString() {
        return "Dog, name: " + name + ", age: " + age;
    }
}
