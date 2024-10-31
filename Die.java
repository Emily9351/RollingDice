/*
    Program: 
    This program sets, gets, rolls, and initalize a die to value 1. 
    The set function sets it to a new given value. 
    The get function returns whatever the current faceValue is. 
    The roll function sets the value to a new faceValue 1-6 to represent the size sides of a die.
 */


package assignment2;

import java.util.Random;

public class Die {
    //Instance Variables
    private int faceValue;

    // No argument - Initialize variable to 1
    public Die() {
        faceValue = 1;
    }

    // Return the faceValue of the die
    public int getFaceValue() {
        return faceValue;
    }

    // Set the faceValue to a new givenValue
    public void setFaceValue(int givenFaceValue) {
        faceValue = givenFaceValue;
    }

    // Roll the die to get a new faceValue between 1 and 6
    public void rollDie() {
        faceValue = (int)((Math.random() * 6) + 1);
    }

}