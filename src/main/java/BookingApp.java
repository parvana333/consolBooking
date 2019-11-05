import controller.BookingController;
import controller.Flight;
import controller.FlightController;

public class BookingApp {
    public static String createid(){
        String id=null;
//should be implemented
        return id;
    }

    public static String createcity(){
        String city=null;

        return city;
    }
    public static String createdate(){
        String date=null;

        return date;
    }
    public static String createtime(){
        String time=null;

        return time;
    }
    public static int seats(){
        int s=0;

        return s;
    }

    public static void main(String[] args) {
        FlightController flight=new FlightController();
        int i=0;
        while(i<20){
            Flight f=new Flight(createid(),createcity(),createdate(),createtime(),seats());
            flight.store(f);

        }

    }



}
