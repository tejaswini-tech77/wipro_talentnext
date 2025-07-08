package classesandobjects;
import java.util.*;
class author {
	String name;
	String email;
	char gender;
	author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getname() {
		return name;
	}
	public String getemail() {
		return email;
	}
	public char getgender() {
		return gender;
	}
	
}
class book{
	private String name;
	private author author;
	private double price;
	private int qtyinstck;
	book(String name,author author,double price,int qtyinstck){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyinstck=qtyinstck;
	}
	public String getaname(){
		return name;
	}
	public author getauthor() {
		return author;
	}
	public double getprice() {
		return price;
	}
	public int qtyinstck() {
		return qtyinstck;
	}
	

}
public class question3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String email=sc.next();
		char gender=sc.next().charAt(0);
		author a=new author(name,email,gender);
		String bookname=sc.next();
		double price=sc.nextDouble();
		int qtyinstck=sc.nextInt();
		book b=new book(bookname,a,price,qtyinstck);
		 System.out.println("\nBook Details:");
	        System.out.println("Name: " + b.getaname());
	        System.out.println("Price: ₹" + b.getprice());
	        System.out.println("Quantity in stock: " + b.qtyinstck());

	        System.out.println("\nAuthor Details:");
	        System.out.println("Name: " + a.getname());
	        System.out.println("Email: " + a.getemail());
	        System.out.println("Gender: " + a.getgender());

	}

}
