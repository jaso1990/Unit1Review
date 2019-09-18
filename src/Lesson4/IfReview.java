package Lesson4;

import java.util.Scanner;

public class IfReview {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        if (num > 7) {
            System.out.println("Too high");
            num--;
        } else if (num < 7) {
            System.out.println("Too low");
            num++;
        } else {
            System.out.println("Just Right");
        }
        //outside of if, will always rn
        System.out.format("Number is now %d\n", num);
        
        int rnum = (int)Math.random() * 10 + 1; //random from 1-10
        System.out.format("Random number is %d\n", rnum);
        
        //find higher num: 3 ways
        
        //1
        if (rnum > num) System.out.println("Random number is higher");
        else System.out.println("Your number is higher");
        
        //2
        System.out.println("The higher number is " + Math.max(num, rnum));
        
        //3
        //higher = is this true? Yes : No
        int higher = rnum > num?  rnum : num;
        System.out.println("The higher number is: " + higher);
    }

}
