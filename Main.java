/*
    Program:
    Creates two dice and rolls them 1000 times.
    Storing the count of the sum of both faceValues.
    Print the counts of 2 through 12.
    Design a histogram to show the integer array storring counts.
 */


 package assignment2;

 public class Main {

    public static void main(String[] args) {
        // Initialize an array to count occurrences for sums from 2 to 12
        int[] die = new int[11]; 

        // create two dice using the Dice.java classes
        Dice twoDie = new Dice();

        // get the sum of the two dice and add it to the corresponding count (repeat 1000 times)
        for (int i = 0; i < 1000; i++) {
            twoDie.rollDice();
            int sumDice = twoDie.getFaceValue();

            if (sumDice >= 2 && sumDice <= 12) {
                die[sumDice - 2]++; 
            }
        }

        // Print occurrences of each sum from 2 to 12
        for (int len = 0; len < 11; len++) {
            int value = len + 2;
            System.out.println("Number of " + value + "s are " + die[len]);
        }

        // Drawing the histogram
        System.out.println("Graph");
        
        for (int y = 175; y >= 0; y -= 25) {
            System.out.printf("%3d|", y); // Format y-axis labels
            for (int len = 0; len < 11; len++) {
                // Print star if the count exceeds the current y value
                if (die[len] >= y) {
                    System.out.print(" * ");
                } 
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        // Print x-axis
        System.out.println("    ---------------------------------");
        System.out.println("     2  3  4  5  6  7  8  9 10 11 12");
    }
}