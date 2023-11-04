package BusResv;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;

    Bus(int busno,boolean ac,int cap){
        this.busNo=busno;
        this.ac=ac;
        this.capacity=cap;
    }

    public int getBusNo(){
        return busNo;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int cap){
        capacity=cap;
    }

    public void setAc(boolean val){
        ac=val;
    }

    public boolean isAc(){
        return ac;
    }

    public void displayBusInfo(){
        System.out.println("Bus no:"+busNo+" AC:"+ac+" Capacity:"+capacity);
    }
}

