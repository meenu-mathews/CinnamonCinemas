package com.cinnamoncinemas.main;

public class SeatArray {
    private final int rows = 3;
    private final int columns = 5;
    private final int TOTALSEATS = rows*columns;

    int numberOfSeats;
    boolean[][] seatArray = new boolean[rows][columns];

    public int getNumberOfSeats() {
        return numberOfSeats;
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
}
