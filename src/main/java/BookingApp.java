
import controller.Flight;
import controller.FlightController;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BookingApp {
    public static String createid(){
        Random r=new Random();
        int i=0;
        String id="";
        while(i<6){
            id=id+ r.nextInt(9);
            i++;
        }
        return id;
    }

    public static String createdate(){
        Random r=new Random();
        LocalDate l=LocalDate.now();
        return l.plusDays(r.nextInt(10)).toString();

    }
    public static String createtime(){
        Random r=new Random();
        LocalTime l=LocalTime.now();
        return l.plusHours(r.nextInt(24)).toString();
    }
    public static int seats(){
        Random r=new Random();
        return r.nextInt(100);
    }

    public static void main(String[] args) throws IOException {
        FlightController flightcontroller=new FlightController();
        List<String> l=new ArrayList<>(Arrays.asList("Budapest","Istanbul","Baku","Buxarest","Ankara"));
        int i=0;
        while(i<5){
            Flight f=new Flight(createid(),l.get(i),createdate(),createtime(),seats());
            flightcontroller.store(f);
            i++;
        }
        flightcontroller.close();


    }

}
