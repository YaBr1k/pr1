package abc;
import java.lang.*;
public class ball {
    int radius;
    String colour;

    public ball() {
        radius = 1;
        colour = "White";
    }

    public ball(int radius) {
        this.radius = radius;
        colour = "White";
    }

    public ball(int radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public int getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }

    public void setRadius(int radius) {
        if (radius <= 0)
            this.radius = 1;
        else
            this.radius = radius;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void getVolume() {
        System.out.println(colour + " ball's volume is " + 4f / 3 * 3.14f * radius * radius * radius);
    }

    @Override
    public String toString() {
        return "Ball, radius: " + radius + ", colour: " + colour;

    }
}
