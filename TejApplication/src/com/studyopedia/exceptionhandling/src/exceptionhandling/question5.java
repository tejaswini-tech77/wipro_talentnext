package exceptionhandling;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class question5 {
	 public static void main(String[] args) {
	        try {
	            if (args.length != 2) {
	                throw new IllegalArgumentException("Error: Please provide exactly 2 arguments - Name and Age.");
	            }

	            String name = args[0];
	            int age;

	            try {
	                age = Integer.parseInt(args[1]);
	            } catch (NumberFormatException e) {
	                throw new NumberFormatException("Error: Age must be a valid integer.");
	            }
	            if (age < 18 || age >= 60) {
	                throw new InvalidAgeException("Error: Age must be >= 18 and < 60.");
	            }
	            System.out.println("Name: " + name);
	            System.out.println("Age: " + age);
	            System.out.println("Input accepted successfully.");

	        
	 } catch (InvalidAgeException e) {
         System.out.println(e.getMessage());
     } catch (IllegalArgumentException e) {
         System.out.println(e.getMessage());
     } 
	    }

}
