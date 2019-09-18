
package Lesson3;

public class MathClass {


    public static void main(String[] args) {
        //Math is a part of core lang, no import needed
        //All math methods are static: do not need to make a new 'math'
        
        int x = 25;
        System.out.println(Math.pow(x, 3)); //25 to power of 3
        System.out.println(Math.sqrt(x)); //square root of 25
        double y = 8.9876;
        System.out.println(Math.round(y)); //round up or down to nearest int
        System.out.println(Math.max(x, y)); //max = highest
        
        //random class: We used Random r = new Random();
        //can get a random using Math
        System.out.println("Here is a random number: "  + Math.random()); //will give between 0 and 1
        
        //to use a range: (int)(Math.random() * range + min number);
        //ex: range is 30 to 50: range = 21, min =31, max = 50
        int rnum = (int)(Math.random() * 10 + 1);
        System.out.println("Random number between 1 & 10: " + rnum);
        
        System.out.println("\n\nShortcut Review\n===============\n");
        
        int a =10;
        a += 10; //a = 20
        System.out.println("A is: " + a);
        int b = a; //b = 20
        b++; // b = 21
        System.out.println("B is: " + b);
        a *=2; //a = 40
        System.out.println("A is doubled to " + a);
        //let c = b, then increase b by 1
        int c = b++; //c =21, b ==22
        System.out.format("C is %d and b is %d", c, b);
        //let b go up by 1 and assign NEW b value to d at the same time
        int d = ++b; //d & b = 23
        System.out.format("D is %d and b is %d", d, b);
    } 
}
