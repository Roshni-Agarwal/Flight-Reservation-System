package com.company;
public class Passenger {

    Address address;
    Contact contact;
   private int idCounter;

    public Passenger(Address address, Contact contact, int idCounter) {
        this.address = address;
        this.contact = contact;
        this.idCounter = idCounter;
    }

    public int getIdCounter() {
        return idCounter;
    }

    public void setIdCounter(int idCounter) {
        this.idCounter = idCounter;
    }

    public Contact getContact() {
        return contact;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "address=" + address +
                ", contact=" + contact +
                ", idCounter=" + idCounter +
                '}';
    }
}
