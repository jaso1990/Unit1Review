
package Lesson4;


public class FormatReview {


    public static void main(String[] args) {
        //assume Barrie has 140,000 people and grows 4% per decade
        //what will it be in 100 years
        int pop = 140000;
        int growth;
        
        //column headings
        System.out.format("%s%20s%20s%20s\n", "YEAR", "POPULATION", "GROWTH", "END POPULATION");
        System.out.format("%s%20s%20s%20s\n", "====", "==========", "======", "==============");
        
        for (int year = 2020; year < 2120; year+=10) {
            System.out.format("%d%20d", year, pop);
            growth = (int)(pop * 0.04);
            pop += growth;
            System.out.format("%20d%20d\n", growth, pop);
        }
        System.out.println("\nIn the year 2120, the population will be: " + pop);
    }
    
}
