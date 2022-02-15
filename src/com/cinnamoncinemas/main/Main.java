package com.cinnamoncinemas.main;
import com.cinnamoncinemas.test.SeatsTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class Main {
@Test
    public static void main(String[] args){

        SeatsTest seatsTest = new SeatsTest();
        SeatArray seatArray = new SeatArray();
        assertTrue("Seats are between 1 and 3",seatsTest.checkIfUserInputIsValid());

    }

}


