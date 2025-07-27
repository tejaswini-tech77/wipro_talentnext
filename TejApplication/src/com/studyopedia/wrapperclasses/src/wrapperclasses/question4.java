package wrapperclasses;
class Employee implements Cloneable {
    int id;
    String name;
    double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}


public class question4 {

	public static void main(String[] args) {
		 try {
	            Employee emp1 = new Employee(101, "Alice", 50000);
	            System.out.println("Original Employee before change:");
	            emp1.display();
	            Employee emp2 = (Employee) emp1.clone();
	            System.out.println("Cloned Employee:");
	            emp2.display();
	            emp1.name = "Bob";
	            emp1.salary = 60000;

	            System.out.println("\nOriginal Employee after change:");
	            emp1.display();

	            System.out.println("Cloned Employee after original is changed:");
	            emp2.display();

	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }

	}

}
