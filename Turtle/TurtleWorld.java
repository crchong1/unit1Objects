import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();
              
        
        int degree = 0;
        int forward = 0;
        
        while (degree <= 360)
        {
            turtle.forward(forward);
            turtle.turn(degree);
            
            degree = degree + 1;
            forward = forward + 1;
        };
        
    }
}
