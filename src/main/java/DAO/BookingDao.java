package DAO;

import controller.Booking;

import java.io.*;

public class BookingDao implements DAO<Booking> {
    File f=new File("bookings.txt");
    FileWriter fwriter =new FileWriter(f);
    BufferedWriter bufWriter=new BufferedWriter(fwriter);
    FileReader freader=new FileReader(f);
    BufferedReader bufReadeR=new BufferedReader(freader);

    public BookingDao() throws IOException{
    }

    @Override
    public void store(Booking data) {
        try{
            bufWriter.write(data.getBid()+ "*");
            bufWriter.write(data.getPassengers()+"*");
        }
        catch (IOException e){
            e.printStackTrace();
        }

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
}
