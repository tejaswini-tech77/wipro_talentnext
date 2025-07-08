package classesandobjects;
import java.util.*;
class animal{
	void eat(){
		System.out.println("Animals can eat.");
	}
	void sleep(){
		System.out.println("Animals can sleep.");
	}
}
class bird extends animal{
	void fly() {
		System.out.println("Birds can fly.");
	}
	void eat() {
		System.out.println("Birds can also eat.");
	}
	void sleep() {
		System.out.println("Birds can also sleep.");
	}
}
public class question4 {

	public static void main(String[] args) {
		animal a=new animal();
		a.eat();
		a.sleep();
		bird b=new bird();
		b.fly();
		b.eat();
		b.sleep();

	}

}
