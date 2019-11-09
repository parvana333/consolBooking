package DAO;
import controller.Flight;
import java.io.*;

public class FlightDao implements DAO<Flight> {
    File f=new File("flights.txt");
    FileWriter fwriter =new FileWriter(f,true);
    BufferedWriter bufWriter=new BufferedWriter(fwriter);
    FileReader freader=new FileReader(f);
    BufferedReader bufReadeR=new BufferedReader(freader);
    public FlightDao() throws IOException {
    }

    public void store(Flight data) {
        try {
            bufWriter.write(data.getId()+"/");
            bufWriter.write(data.getDestination()+"/");
            bufWriter.write(data.getDate()+"/");
            bufWriter.write(data.getTime()+"/");
            bufWriter.write(data.getFreeSeats()+"/"+"\n");

        } catch (IOException e) {
            e.printStackTrace();

        }

    }
    public String get(String id){
        try {
            String line=null;
            while((line=bufReadeR.readLine())!=null){
                if(line.contains(id)){
                    return line;
                }
            }
            bufReadeR.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return "there is not such a flight";

    }

    public void delete(String id) {


    }

    public void update(Flight data) {

    }

    @Override
    public void close() throws IOException {
        bufWriter.close();
    }
}
