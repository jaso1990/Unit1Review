
package Lesson3;
import TurtleGraphics.*;

public class ObjectExamples {


    public static void main(String[] args) {
        Pen p1, p2, p3;
        /*
        OBJECTS are created from a class
        Some objects can be part of the same family and have a common parent
        p1 p2 p3 are still open to become diff types of pens
        Pen is the parent to diff types of pens
        
        Polymorphism: When an object can become one of many different types of an object
        */
        SketchPadWindow w = new SketchPadWindow(800, 600);
        p1 = new StandardPen(w);
        p2 = new RainbowPen(w);
        p3 = new WigglePen(w);
        
        /*
        ALL 3 pens respond to same commands
        'p1.' shows all of the pens instance methods (abilities)
        there are also additional abilities that are NOT part of the pen class
        All objects inherit abilities from the object class
        Object is the MOTHER OF ALL CLASSES
        */
        p1.up();
        p1.move(-100, -100);
        p1.down();
        p1.setDirection(0);
        
        //draw square
        
        for (int i = 0; i < 4; i++) {
            p1.move(100);
            p1.turn(90);
  
        }
        
        p3.up();
        p3.move(200, -100);
        p3.down();
        p3.setDirection(0);
        
        //draw square
        
        for (int i = 0; i < 4; i++) {
            p3.move(100);
            p3.turn(90);
  
        }
        
        p2.up();
        p2.move(-100, 100);
        p2.down();
        p2.setDirection(0);
        p2.setWidth(20);
        
        //draw square
        
        for (int i = 0; i < 4; i++) {
            p2.move(100);
            p2.turn(90);
  
        }
        //you can change the type of pen
        p1 = new WigglePen(w); //p1 becomes wiggle pen from normal pen
        p1.move(100);
        
        
        
        

    }
    
}
