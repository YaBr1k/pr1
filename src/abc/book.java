package abc;
import java.lang.*;
public class book {
    int publishYear;
    String name;

    public  book()
    {
        publishYear = 2052;
        name = "Book 3";
    }

    public  book(int publishYear)
    {
        this.publishYear = publishYear;
        name = "Book 3";
    }

    public  book(int publishYear, String name)
    {
        this.publishYear = publishYear;
        this.name = name;
    }

    public int getPublishYear()
    {
        return publishYear;
    }

    public String getName()
    {
        return name;
    }

    public void setPublishYear(int publishYear)
    {
        if (publishYear > 2052)
            publishYear = 2052;
        else
            this.publishYear = publishYear;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public  void getBookAge()
    {
        System.out.println(name + " was published " + (2052 - publishYear) + " years ago.");
    }

    @Override
    public String toString()
    {
        return "Book, Publish Year " + publishYear + ", name: " + name;
    }
}
