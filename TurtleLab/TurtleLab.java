// by Connor Chong. This graphs a sin(x) curve and a -sin(x) graph) using turtles
import java.awt.Color;
import java.util.Random;
import java.lang.Math;

public class TurtleLab
{
    public static void main (String[] args) 
    {
        World turtleWorld = new World();                                            // create object turtleWorld 
        Turtle turtle1 = new Turtle(turtleWorld);                                   // create turtle 1           
        Turtle turtle2 = new Turtle(turtleWorld);                                   // create turtle 2       
        turtle1.penUp();                                                            // Set pen1 up
        turtle2.penUp();                                                            // Set pen2 up
        int increment = 1;                                                          // declare int increment
        
        turtle1.turn(90);                                                           // start out turtle in the right direction
        turtle2.turn(90);                                                           // start out turtle in the right direction
        
        turtle1.moveTo(0, 200);                                                     // Move turtle to starting position
        turtle2.moveTo(0, 200);                                                     // Move turtle to starting position
        turtle1.penDown();                                                          // Set pen1 down
        turtle2.penDown();                                                          // Set pen2 down
        turtle1.setPenColor(Color.BLUE);                                            // Set pen blue color
        turtle2.setPenColor(Color.RED);                                             // Set pen red color
        double dy;                                                                  // declare double dy
        double y;                                                                   // declare double y
        double siny;                                                                // declare double sin x
        double newSinY;                                                             // declare double newSinY 
        
        while (increment<=500)
        {
            // Sin(x)
            dy = (increment*2*Math.PI)/200;                                         // Stretches graph over a large distance so we can see it
            y = 150* Math.sin(dy) + 200;                                            // Get the Y value of the sin x
            y = y + .5;                                                             // Rounds number to nearest whole int
            int newY = (int) y;                                                     // Rounds number to nearest whole int using (int)
            turtle1.moveTo(increment, newY);                                        // Moves turtle1 to the point
            
            
            // -Sinx 
            siny = (increment*2*Math.PI)/200;                                       // Stretches graph over a large distance so we can see it
            newSinY = -150* Math.sin(siny) + 200;                                   // Get the Y value of the -sin x
            newSinY = newSinY + .5;                                                 // Rounds number to nearest whole int
            int intSinY = (int) newSinY;                                            // Rounds number to nearest whole int using (int)
            turtle2.moveTo(increment, intSinY);                                     // Moves turtle2 to the point
            
            increment = increment + 1;                                              // Increment is like the dx in the graph- the smallest distance increment  
        }; // while loop to reiterate the graph until it was finished
    }; // main ()  
}; // class ()
        
    
        

