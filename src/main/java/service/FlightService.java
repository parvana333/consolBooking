package service;
import DAO.*;
import controller.Flight;

import java.io.IOException;

public class FlightService {
private DAO<Flight> dao;

    public FlightService() throws IOException {
        dao=new FlightDao();
    }

 public void store(Flight data){
        dao.store(data);
}
public  void close()throws IOException{
        dao.close();
}




}
