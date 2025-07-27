package Test;
import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

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
    }

}
