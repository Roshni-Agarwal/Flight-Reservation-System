package com.company;

import java.time.Duration;
import java.time.LocalDateTime;


public class Ticket {


    String PNRNumber;
    String departureLocation;
    String destinationLocation;
    LocalDateTime arrival;
    LocalDateTime destination;
    Passenger passenger;
    String seatNo;
    boolean isCancled;
    int price;
    Flight flight;

    public Ticket(String PNRNumber, String departureLocation, String destinationLocation,
                  LocalDateTime arrival, LocalDateTime destination, Passenger passenger,
                  String seatNo, boolean isCancled, int price, Flight flight) {
        this.PNRNumber = PNRNumber;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.arrival = arrival;
        this.destination = destination;
        this.passenger = passenger;
        this.seatNo = seatNo;
        this.isCancled = isCancled;
        this.price = price;
        this.flight = flight;
    }

    public  String checkStatus(){
       if(isCancled==true){
           return "Cancel";
       }
       else{
           return "Confirm";
       }

   }
   public long getDuration(){
       Duration duration = Duration.between(arrival, destination);
       long diff = Math.abs(duration.toMinutes());
       return diff;

   }
   public void cancelTicket(){
       isCancled=true;

   }

    @Override
    public String toString() {
        return "Ticket{" +
                "PNRNumber='" + PNRNumber + '\'' +
                ", departureLocation='" + departureLocation + '\'' +
                ", destinationLocation='" + destinationLocation + '\'' +
                ", arrival=" + arrival +
                ", destination=" + destination +
                ", passenger=" + passenger +
                ", seatNo='" + seatNo + '\'' +
                ", isCancled=" + isCancled +
                ", price=" + price +
                ", flight=" + flight +
                '}';
    }


}
