package com.cinnamoncinemas.test;

import com.cinnamoncinemas.main.SeatArray;

import java.util.Scanner;
public class SeatsTest {
    int numberOfSeats;

    SeatArray seatArray = new SeatArray();
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getRemainingNumberOfSeats(){

        int TOTALSEATS = seatArray.rows * seatArray.columns;
        return TOTALSEATS -numberOfSeats;
    }

    public boolean checkIfUserInputIsValid() {
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter number of seats (between 1 & 3): ");
        } while( !isValid(numberOfSeats = in.nextInt()) );
        seatArray.allocateSeats();
        System.out.println("Only "+getRemainingNumberOfSeats()+" empty seats remaining");
        return true;
    }

    private boolean isValid(int numberOfSeats){
        if (numberOfSeats <= 0 || numberOfSeats > 3){
            System.out.println(numberOfSeats + " is not a valid number.");
            return false;
        }  else return true;
    }

}

