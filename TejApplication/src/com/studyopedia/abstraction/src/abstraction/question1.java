package abstraction;
import java.util.*;
abstract class Compartment {
    public abstract String notice();
}
class FirstClass extends Compartment {
    public String notice() {
        return "Notice: This is a First Class compartment.";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "Notice: This is a Ladies compartment.";
    }
}

class General extends Compartment {
    public String notice() {
        return "Notice: This is a General compartment.";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "Notice: This is a Luggage compartment.";
    }
}

public class question1 {

	public static void main(String[] args) {
		 Compartment[] compartments = new Compartment[10];
	        Random rand = new Random();

	        for (int i = 0; i < compartments.length; i++) {
	            int type = rand.nextInt(4) + 1; // Random number between 1 and 4

	            switch (type) {
	                case 1:
	                    compartments[i] = new FirstClass();
	                    break;
	                case 2:
	                    compartments[i] = new Ladies();
	                    break;
	                case 3:
	                    compartments[i] = new General();
	                    break;
	                case 4:
	                    compartments[i] = new Luggage();
	                    break;
	            }
	        }

	        for (int i = 0; i < compartments.length; i++) {
	            System.out.println("Compartment " + (i + 1) + ": " + compartments[i].notice());
	        }
	    }

	}


