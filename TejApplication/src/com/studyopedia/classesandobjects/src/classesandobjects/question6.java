package classesandobjects;
import java.util.*;
class fruit{
	String name;
	String taste;
	String size;
	fruit(String name,String taste,String size){
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	void eat() {
		System.out.println("The fruit name is"+name);
		System.out.println("The taste is "+taste);
	}
}
class apple extends fruit{
	apple(String name,String taste,String size){
		super(name,taste,size);
	}
	void eat() {
		System.out.println("Apple is "+taste+" in taste.");
	}
}
class orange extends fruit{
	orange(String name,String taste,String size){
		super(name,taste,size);
	}
	void eat() {
		System.out.println("orange is "+taste+" in taste.");
	}
}

public class question6 {

	public static void main(String[] args) {
		apple a =new apple("Apple","sweet","medium.");
		a.eat();
		orange o=new orange("Orange","sour","large.");
		o.eat();

	}

}
