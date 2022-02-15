package com.cinnamoncinemas.main;

public class SeatArray {
    private final int rows = 3;
    private final int columns = 5;
    private final int TOTALSEATS = rows*columns;
    int[][] seatArray = new int[rows][columns];

    public int getNumberOfSeats(int numberOfSeats){
        return TOTALSEATS-numberOfSeats;
    }
}
