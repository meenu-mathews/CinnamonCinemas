package com.cinnamoncinemas.main;
import com.cinnamoncinemas.test.SeatsTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;
/*
Pseudo Code
        Write a program that allocates seats based on a random integer “number of seats” between 1 and 3
        Your program should allocate the required number of seats from the available seats starting from seat A1 and filling the auditorium from
        left to right, front to back
        All the seats are available for sale when the program starts
        The program should continue to allocate a random number of seats until it finds there are not enough seats left to complete the request
        Once there are not enough seats available to be allocated then the program can halt
*/

public class Main {
@Test
    public static void main(String[] args){

        SeatsTest seatsTest = new SeatsTest();
        assertTrue("Seats are between 1 and 3",seatsTest.checkIfUserInputIsValid());

    }

}


