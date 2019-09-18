
import java.util.Scanner;

public class TempConvert1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double far, cel;
        //input
        System.out.print("What is the temperature in F: ");
        far = s.nextDouble();
        //process
        cel = (far - 32.0) * 5.0 / 9.0;
        //output
        System.out.format("The temperature in C is: %.2f degrees\n", cel);

    }

}
