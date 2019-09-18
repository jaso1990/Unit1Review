
import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;

public class TurtleDemo1 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int x1, y1, x2, y2;
        System.out.print("Enter x1 value: ");
        x1 = s.nextInt();
        System.out.print("Enter y1 value: ");
        y1 = s.nextInt();
        System.out.print("Enter x2 value: ");
        x2 = s.nextInt();
        System.out.print("Enter y2 value: ");
        y2 = s.nextInt();
        
        
        Pen p = new StandardPen(new SketchPadWindow(640, 480));
        //draw axis
        p.up();
        p.move(-320, 0);
        p.down();
        p.setDirection(0);//right
        p.move(640);
        p.up();
        p.move(0, -240);
        p.down();
        p.setDirection(90);
        p.move(480);
        
        //draw ticks on x-axis
        for (int i = -320; i < 320; i+=40) {
            drawTick(p, i, 0, 0);
        }
        //draw ticks on y-axis
        for (int i = -240; i < 240; i+=40) {
            drawTick(p, 0, i, 1);
        }
        
        //text of location
        p.move(x1,y1);
        p.down();
        p.drawString("(" + x1 + "," + y1 + ")");
        p.move(x2, y2);
        p.drawString("(" + x2 + "," + y2 + ")");
        
        //draw dots
        drawDot(p, x1, y1);
        drawDot(p, x2, y2);
        
    }

    //static means not attached to an object
    public static void drawTick(Pen p, int x, int y, int dir) {
        //dir 0 = x, dir 1 = y
        p.up();
        p.move(x, y);
        p.down();
        if (dir==0) 
            p.setDirection(90);
        else 
            p.setDirection(0);
        p.move(10);
        p.up();
        p.move(5);
        if (dir==0)
            p.drawString("" + x);
        else
            p.drawString("" + y);
    }
    
    public static void drawDot(Pen p, int x, int y){
        p.up();
        p.move(x, y);
        p.down();
        p.setWidth(10);
        p.setColor(Color.red);
        p.move(1);
        p.setWidth(1);
        p.setColor(Color.blue);
        
    }
}
