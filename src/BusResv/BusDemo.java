package BusResv;
import java.util.*;


public class BusDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();
        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,false,1));
        buses.add(new Bus(3,true,3));
        buses.add(new Bus(4,false,10));


        for(Bus b:buses){
            b.displayBusInfo();

        }
        int userOpt=1;
        while(userOpt==1){
            System.out.println("Enter 1 to book tickets or Enter 2 to exit");
            userOpt=sc.nextInt();
            if(userOpt==1){
                Booking booking = new Booking();
                if(booking.isAvailable(buses,bookings)){
                    bookings.add(booking);
                    System.out.println("Your Booking is confirmed");
                }
                else{
                    System.out.println("Sorry bus is full try another or date");
                }
            }
        }

    }
}
