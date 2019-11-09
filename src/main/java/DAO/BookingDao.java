package DAO;

import controller.Booking;

import java.io.*;

public class BookingDao implements DAO<Booking> {
    File f=new File("bookings.txt");
    PrintWriter out= new PrintWriter(new
            BufferedWriter(new FileWriter(f, true)));

    FileReader freader=new FileReader(f);
    BufferedReader bufReadeR=new BufferedReader(freader);

    public BookingDao() throws IOException{
    }
    @Override
    public void store(Booking data) {
            out.write(data.getBid()+ "*");
            out.write(data.getPassengers()+ "*");
    }

    @Override
    public String get(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
    @Override
    public void update(Booking data) {

    }

    @Override
    public void close() throws IOException {

    }
}
