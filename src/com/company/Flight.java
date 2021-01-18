package com.company;
public class Flight {
    String flightNumber;
    String airlineName;
    int capacity;
    private int bookedSeats;

    public Flight(String flightNumber, String airlineName, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airlineName = airlineName;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String checkFlightDetails(){
        return flightNumber+" "+airlineName;
    }
    public  int checkSeatAvailability(){
        return capacity-bookedSeats;
    }
    public  void booking(){

    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", airlineName='" + airlineName + '\'' +
                ", capacity=" + capacity +
                ", bookedSeats=" + bookedSeats +
                '}';
    }
}
