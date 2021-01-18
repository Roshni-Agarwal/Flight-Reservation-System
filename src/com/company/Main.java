package com.company;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] arg){

        String[] locations = {"DL", "BL","HP","LL","AG"};
        Address a=new Address("71","Bn", "UP");
        Contact c=new Contact("Ay","900000000","ayus@gmail.com");
        Flight f=new Flight("123","AI",128,33);
        Passenger p=new Passenger(a,c,12);
        Ticket ticket=new Ticket("2234556","BN","DL", LocalDateTime.now(),LocalDateTime.now().plusMinutes(70),p,"33",
                false,675,f);
        RegularTicket r=new RegularTicket("Food");
        TouristTicket t=new TouristTicket("BNww",locations);

        System.out.println(f.checkFlightDetails());
        System.out.println(f.checkSeatAvailability());

        System.out.println(ticket.checkStatus());
        System.out.println(ticket.getDuration());

        System.out.println(a);
        System.out.println(c);
        System.out.println(f);
        System.out.println(p);
        System.out.println(ticket);
        System.out.println(r);
        System.out.println(t);


    }
}
