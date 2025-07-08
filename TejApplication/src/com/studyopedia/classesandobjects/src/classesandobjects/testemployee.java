package classesandobjects;
import java.util.*;
class person{
	String member;
	person(String member){
		this.member=member;
	}
	public String getmember() {
		return member;
	}
}
class employee extends person{
	double salary;
	int year;
	String insuranceno;
	employee(String member,double salary,int year,String insuranceno){
		super(member);
		this.salary=salary;
		this.year=year;
		this.insuranceno=insuranceno;
	}
	public double getsalary() {
		return salary;
	}
	public int getyear() {
		return year;
	}
	public String getinsuranceno() {
		return insuranceno;
	}
	public void setsalary() {
		this.salary=salary;
	}
	public void setyear() {
		this.year=year;
	}
}
public class testemployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		double d=sc.nextDouble();
		int i=sc.nextInt();
		String s=sc.next();
		employee e=new employee(a,d,i,s);
		System.out.print("/n Employee details");
		System.out.println("employee name "+e.getmember());
		System.out.println("Salary "+e.getsalary());
		System.out.println("The year employee started to work "+e.getyear());
		System.out.println("Insurance number "+e.getinsuranceno());

	}

}
