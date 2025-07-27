package abstraction;

public interface vehicle {
    default void message() {
        System.out.println("Inside Vehicle");
    }
}

