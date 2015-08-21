import java.awt.Color;
import java.util.Random;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);

        turtle.penDown();
              
        
        int degree = 50;
        int forward = 0;
        int color = 1;
        int max = 8;
        int min = 1;
        while (forward <= 200)
        {
            
            turtle.turn(degree);
            
            if (color == 1)
                {            
                turtle.setPenColor(Color.CYAN);
                };
            if (color == 2)
                {
                turtle.setPenColor(Color.MAGENTA);
                };
            if (color == 3)
                {
                turtle.setPenColor(Color.ORANGE);
                };
            if (color == 4)
                {
                turtle.setPenColor(Color.BLUE);
                };
                
            if (color == 5)
                {
                turtle.setPenColor(Color.GREEN);
                };
            
            if (color == 6)
                {
                turtle.setPenColor(Color.RED);
                };
            if (color == 7)
                {
                turtle.setPenColor(Color.GRAY);
                };
            if (color == 8)
                {
                turtle.setPenColor(Color.GRAY);
                };
            turtle.forward(forward);
            forward = forward + 1;
            
            Random rand = new Random();
            color = rand.nextInt((max - min) + 1) + min;
           
            };
        }; 
    };
