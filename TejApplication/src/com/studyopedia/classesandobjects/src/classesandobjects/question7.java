package classesandobjects;
import java.util.*;
class shape{
	void draw() {
		System.out.println("Drwaing shape is");
	}
	void erase() {
		System.out.println("Erasing shape is ");
	}
}
class circle extends shape{
	void draw() {
		System.out.println("Drawing circle.");
	}
	void erase() {
		System.out.println("Erasing circle.");
	}
}
class triangle extends shape{
	void draw() {
		System.out.println("Drawing triangle.");
	}
	void erase() {
		System.out.println("Erasing triangle.");
	}
	
}
class square extends shape{
	void draw() {
		System.out.println("Drawing square.");
	}
	void erase() {
		System.out.println("Erasing square.");
	}
	
}
public class question7 {

	public static void main(String[] args) {
		circle c=new circle();
		triangle t=new triangle();
		square s=new square();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();

	}

}
