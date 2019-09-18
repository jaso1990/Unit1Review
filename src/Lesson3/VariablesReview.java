
package Lesson3;

public class VariablesReview {

    public static void main(String[] args) {
        //primitives: can do 1 things, store data
        byte b = 127; //occupies 1 byte of memory (127 is one byte)
        short c = 12345; // 2 bytes
        int a = 1234567890; //4 bytes
        long d = 1234356789012345789L; //8 bytes
        
        float flt = 45.78F; //4 bytes
        double dbl = 45.78; //8 bytes
        
        char letter = 'a'; //2 bytes
        boolean bool = true; //1 byte
        
        //Strings: NOT primitive. Have many methods (abilities)
        
        //3 things to know about ALL object methods
        //a) ALL methods have a return type (void, int, double etc)
        //b) Methods may or may not require parameters 
        //c) Some methods have more than one way to run them (ex: pen.move(x), pen.move(x,y);)
        
        String s = "I went to school today";
        //s. brings up methods
        
        int len = s.length();
        System.out.println("Length of s is: " + len);
        
        char lett = s.charAt(7);
        String str1 = s.substring(0, 4); //I we
        String str2 = s.substring(7); //to school today
        System.out.println(str1);
        System.out.println(str2);
        
        //escape codes:  \n  \t  \" \\
        System.out.println("I went \n to school today"); // \n = new line
        System.out.println("I went \t\t\t to school today"); // \t = tab
        System.out.println("She was like \"No Way!\" "); // \" = quotes in a string
        System.out.println("Path to file is C:\\Downloads\\Temp"); //backslash within string
    }
    
}
