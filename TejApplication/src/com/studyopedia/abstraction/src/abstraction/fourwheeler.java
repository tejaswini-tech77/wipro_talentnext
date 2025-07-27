package abstraction;

public interface fourwheeler {
    default void message() {
        System.out.println("Inside FourWheeler");
    }
}

