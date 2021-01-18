package com.company;

import java.time.LocalDateTime;

public class RegularTicket extends Ticket{
    private String specialService;

    public RegularTicket(String PNRNumber, String departureLocation, String destinationLocation,
                         LocalDateTime arrival, LocalDateTime destination, Passenger passenger,
                         String seatNo, boolean isCancled, int price, Flight flight, String specialService) {
        super(PNRNumber, departureLocation, destinationLocation,arrival, destination, passenger,seatNo,isCancled, price,
                flight);

        this.specialService = specialService;
    }

    public String getSpecialService() {
        return specialService;
    }

    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }

    @Override
    public String toString() {
        return "RegularTicket{" +
                "specialService='" + specialService + '\'' +
                '}';
    }
}
