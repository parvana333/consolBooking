package controller;

public class Booking {
    String bid;
    Passengers [] passengers;

    public Booking(String bid, Passengers[] passengers) {
        this.bid = bid;
        this.passengers = passengers;
    }

    public String getBid() {
        return bid;
    }

    public Passengers[] getPassengers() {
        return passengers;
    }
}
