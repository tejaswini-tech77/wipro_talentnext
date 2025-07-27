package test3;
import java.util.*;


 class Compartment {
    double height;
    double width;
    double breadth;

     Compartment(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public void display() {
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Breadth: " + breadth);
    }
 }
    public class question2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();

            Compartment cm = new Compartment(x, y, z);
            cm.display();
        }
    }
