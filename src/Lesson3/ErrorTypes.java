
package Lesson3;

import java.util.Scanner;

public class ErrorTypes {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        //syntax: prevents program from running
        
        int x;
        System.out.print("Enter a value for x: ");
        //x = s.nextDouble(); //error, because x is an int
        
        
        //Logic Error: code works fine, but gives wrong result
        double hours = 10.5, wage = 14.5;
        double pay = hours + wage;
        System.out.println("Your pay this week is: " + pay); //(pay should be hours * wage)
        
        //Runtime Error:  program starts then crashes
        System.out.print("Enter a value for x: "); //entering a double for x will cause the program to crash
        x = s.nextInt();
        
        //Best approach: use try/catch to find errors
        try{
         System.out.print("Enter a value for x: "); //entering a double for x will cause the program to crash
        x = s.nextInt();
        }catch(Exception e){
            System.out.println("Error, did not enter a proper integer");
        }
    }
    
}
