package com.cinnamoncinemas.main;


import com.cinnamoncinemas.test.SeatsTest;

import static org.testng.AssertJUnit.assertTrue;

public class Main {

    public static void main(String[] args){

        SeatsTest seatsTestObj = new SeatsTest();

        assertTrue(seatsTestObj.checkIfUserInputIsValid());
    }
}


