package BusResv;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;


public class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        passengerName = sc.next();
        System.out.println("Enter Bus Number you want to book:");
        busNo = sc.nextInt();
        System.out.println("Enter the date of travel like(dd-mm-yyyy):");
        String dateinput = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date= dateFormat.parse(dateinput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }

    public boolean isAvailable(ArrayList<Bus> buses,ArrayList<Booking> bookings){
        int c=0;
        for(Bus b:buses){
            if(b.getBusNo()==busNo){
                c= b.getCapacity();
            }
        }
        int booked=0;
        for(Booking b:bookings){
            if(b.busNo==busNo && b.date.equals(date)) booked++;
        }
        return booked<c?true:false;
    }



}
