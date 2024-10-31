/*
    Program: 
    This program creates, gets sum, and rolls two dice.
    Creates two dice with faceValues initialized to 1.
    The get method sums the value of the faceValue of the two dice.
    The roll method rolls both dice.
 */

package assignment2;

public class Dice {
    // Instance Variables
    private Die die1; 
    private Die die2;

    // Create two Die using Die.java methods
    public Dice () {
        die1 = new Die();
        die2 = new Die();
    }

    // Return the sum of each of the die faceValues
    public int getFaceValue() {
        return die1.getFaceValue() + die2.getFaceValue();
    }

    // Roll both die
    public void rollDice() {
        die1.rollDie();
        die2.rollDie();
    }
}