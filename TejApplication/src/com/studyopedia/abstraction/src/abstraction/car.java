package abstraction;

public class car implements vehicle, fourwheeler {
    public void message() {
        
        vehicle.super.message();
    }
}