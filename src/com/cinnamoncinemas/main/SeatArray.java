package com.cinnamoncinemas.main;

import com.cinnamoncinemas.test.SeatsTest;

public class SeatArray {
    public final int rows = 3;
    public final int columns = 5;

    boolean[][] seatArray = new boolean[rows][columns];
SeatsTest seatsTest = new SeatsTest();

    public void allocateSeats(){
//        System.out.print("Enter ");
        while(seatsTest.getRemainingNumberOfSeats()>=0)
            for(int i=0;i<rows;i++){
                for(int j=0;j<seatsTest.getNumberOfSeats();j++){
                    seatArray[i][j] = false;
                }
            }
    }


}
