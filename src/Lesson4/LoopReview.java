package Lesson4;

public class LoopReview {

    public static void main(String[] args) {
        //for loop
        for (int i = 0; i < 10; i++) {
            System.out.format("i is now %d\n", i);
        }

        for (double temp = 20; temp >= 10; temp -= 0.5) {
            System.out.format("The temp is: %.2f\t", temp);
            String weather = temp >= 15 ? "warm" : "cold";
            System.out.format("It is %s outside\n", weather);
        }
        
        //while loop
        //game: computer picks random num (1-20), count how long until 7 picked
        
        //GAME 1
        int rnum;
        int tries = 0;
        System.out.println("GAME 1\n=====================\n");
        do{
           rnum = (int) (Math.random() * 20 + 1);
           tries ++;
            System.out.format("On try %d, the computer picked %d\n", tries, rnum);
        }while (rnum != 7);
        System.out.println("End of game 1, it took " + tries + " tries.");
        
        
        //GAME 2
        System.out.println("\nGAME 2\n=====================\n");
        tries = 0;
        rnum = 0;
        while (rnum != 7){
           rnum = (int) (Math.random() * 20 + 1);
           tries ++;
           System.out.format("On try %d, the computer picked %d\n", tries, rnum);
        }
        System.out.println("End of game 2, it took " + tries + " tries.");

        
        
        //GAME 3
        System.out.println("\nGAME 3\n=====================\n");
        tries = 0;
        rnum = 0;
        while (true){
           rnum = (int) (Math.random() * 20 + 1);
           tries ++;
           System.out.format("On try %d, the computer picked %d\n", tries, rnum);
           if (rnum ==7)
               break;
        }
        System.out.println("End of game 3, it took " + tries + " tries.");
    }

}
