package com.company;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    private String[] selectedTouristLocation=new String[5];

    public TouristTicket(String PNRNumber, String departureLocation, String destinationLocation,
                         LocalDateTime arrival, LocalDateTime destination, Passenger passenger,
                         String seatNo, boolean isCancled, int price, Flight flight,String hotelAddress, String[] selectedTouristLocation) {
        super(PNRNumber, departureLocation, destinationLocation,arrival, destination, passenger,seatNo,isCancled, price,
                flight);

        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }
   public void  removeTouristLocation(String location){

    }
    public void addTouristLocation(String location){

    }

    @Override
    public String toString() {
        return "TouristTicket{" +
                "hotelAddress='" + hotelAddress + '\'' +
                ", selectedTouristLocation=" + Arrays.toString(selectedTouristLocation) +
                '}';
    }
}
