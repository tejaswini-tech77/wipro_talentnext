package test4;
import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;
import com.automobile.fourwheeler.Logan;
import com.automobile.fourwheeler.Ford;

public class Test {
    public static void main(String[] args) {
        Hero heroBike = new Hero();
        System.out.println("Hero Bike:");
        System.out.println("Model: " + heroBike.getModelName());
        System.out.println("Reg No: " + heroBike.getRegistrationNumber());
        System.out.println("Owner: " + heroBike.getOwnerName());
        System.out.println("Speed: " + heroBike.getSpeed());
        heroBike.radio();

        System.out.println();

        Honda hondaBike = new Honda();
        System.out.println("Honda Bike:");
        System.out.println("Model: " + hondaBike.getModelName());
        System.out.println("Reg No: " + hondaBike.getRegistrationNumber());
        System.out.println("Owner: " + hondaBike.getOwnerName());
        System.out.println("Speed: " + hondaBike.getSpeed());
        hondaBike.cdplayer();

        System.out.println();

        Logan loganCar = new Logan();
        System.out.println("Logan Car:");
        System.out.println("Model: " + loganCar.getModelName());
        System.out.println("Reg No: " + loganCar.getRegistrationNumber());
        System.out.println("Owner: " + loganCar.getOwnerName());
        System.out.println("Speed: " + loganCar.speed());
        loganCar.gps();

        System.out.println();

        Ford fordCar = new Ford();
        System.out.println("Ford Car:");
        System.out.println("Model: " + fordCar.getModelName());
        System.out.println("Reg No: " + fordCar.getRegistrationNumber());
        System.out.println("Owner: " + fordCar.getOwnerName());
        System.out.println("Speed: " + fordCar.speed());
        fordCar.tempControl();
    }
}
