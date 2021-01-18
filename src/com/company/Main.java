package com.company;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] arg){

        String[] locations = {"DL", "BL","HP","LL","AG"};

        Flight f=new Flight("123","AI",128,33);
        Passenger p=new Passenger("71","Bn", "UP","Ay","900000000","ayus@gmail.com",12);

       RegularTicket regular=new RegularTicket("R2234556","BN","DL", LocalDateTime.now(),
               LocalDateTime.now().plusMinutes(70),p,"33", false,675,f,"Food");
        TouristTicket tourist=new TouristTicket("T2234556","BN","DL", LocalDateTime.now(),LocalDateTime.now().plusMinutes(70),
                p,"33", false,675,f,"BNww",locations);

        printTicketDetails(regular);
        printTicketDetails(tourist);

    }
    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPNRNumber());

    }
}
