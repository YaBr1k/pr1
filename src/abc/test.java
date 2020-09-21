package abc;
import java.lang.*;
public class test {
    public static void main(String[] args){
        dog dog = new dog();
        System.out.println(dog);
        dog.turnIntoHumanAge();
        dog.setAge(10);
        dog.turnIntoHumanAge();

        System.out.println(" ");

        book book = new book(1400);
        book.getBookAge();
        book.setName("Cool book");
        book.getBookAge();
        System.out.println(book);

        System.out.println(" ");

        ball ball = new ball(5, "Red");
        System.out.println(ball);
        ball.setColour("Green");
        System.out.println(ball);

    }
}
