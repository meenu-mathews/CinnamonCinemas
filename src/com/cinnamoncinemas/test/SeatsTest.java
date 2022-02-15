package com.cinnamoncinemas.test;

import com.cinnamoncinemas.main.SeatArray;

import java.util.Scanner;
public class SeatsTest {
    private final int rows = 3;
    private final int columns = 5;
    private final int TOTALSEATS = rows*columns;
    boolean[][] seatArray = new boolean[rows][columns];
    int numberOfSeats;

    public int getNumberOfSeats(){

        return TOTALSEATS-numberOfSeats;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void allocateSeats(){
        while(getNumberOfSeats()!=0)
            for(int i=0;i<rows;i++){
                for(int j=0;j<columns;j++){
                    seatArray[i][j] = false;
                }
            }
    }
    public boolean checkIfUserInputIsValid() {
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter number of seats (between 1 & 3): ");
        } while( !isValid(numberOfSeats = in.nextInt()) );
        allocateSeats();
        System.out.println("Only "+getNumberOfSeats()+" empty seats remaining");
        return true;
    }

    private boolean isValid(int numberOfSeats){
        if (numberOfSeats <= 0 || numberOfSeats > 3){
            System.out.println(numberOfSeats + " is not a valid number.");
            return false;
        }  else return true;
    }

}

