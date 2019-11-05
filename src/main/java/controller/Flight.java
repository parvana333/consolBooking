package controller;

public class Flight {
    private String id;
    private String date;
    private String time;
    private String destination;
    private int freeSeats;

    public Flight(String id, String date, String time, String destination, int freeSeats) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.destination = destination;
        this.freeSeats = freeSeats;
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getDestination() {
        return destination;
    }

    public int getFreeSeats() {
        return freeSeats;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", destination='" + destination + '\'' +
                ", freeSeats=" + freeSeats +
                '}';
    }
}
