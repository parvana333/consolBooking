package controller;

import service.FlightService;

import java.io.IOException;

public class FlightController {
    private FlightService flightService;

    public FlightController() throws IOException {
        this.flightService=new FlightService();

    }

   public void store(Flight data){
        flightService.store(data);
   }
   public void close() throws IOException{
        flightService.close();
   }
}
