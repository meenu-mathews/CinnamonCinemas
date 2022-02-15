package com.cinnamoncinemas.test;

import org.testng.annotations.Test;

import java.util.Scanner;

import static org.testng.AssertJUnit.assertTrue;
public class SeatsTest {

    public boolean checkIfUserInputIsValid() {
        int numberOfSeats;

        Scanner in = new Scanner(System.in);
        boolean okay;
        do {
            System.out.print("Enter number of seats (between 1 & 3): ");
            numberOfSeats = in.nextInt();
            if (numberOfSeats > 0 && numberOfSeats < 4) {
                okay = true;
            } else {
                okay = false;
                String word = in.next();
                System.err.println(word + " is not a valid number.");
            }
        } while (!okay);
        int x = in.nextInt();
        return okay;
    }

}