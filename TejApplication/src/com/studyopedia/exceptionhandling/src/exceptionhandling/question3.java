package exceptionhandling;
import java.util.*;
class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}
public class question3 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        final int STUDENTS = 2;
	        final int SUBJECTS = 3;

	        for (int i = 1; i <= STUDENTS; i++) {
	            try {
	                System.out.println("Enter the name of student " + i + ":");
	                String name = scanner.nextLine();

	                int[] marks = new int[SUBJECTS];
	                int sum = 0;

	                for (int j = 0; j < SUBJECTS; j++) {
	                    System.out.println("Enter marks for subject " + (j + 1) + " (0-100):");
	                    String input = scanner.nextLine();

	                    // Parse input
	                    int mark = Integer.parseInt(input);

	                    // Custom validation
	                    if (mark < 0) {
	                        throw new InvalidMarkException("Negative marks are not allowed.");
	                    } else if (mark > 100) {
	                        throw new InvalidMarkException("Marks should be in the range 0-100.");
	                    }

	                    marks[j] = mark;
	                    sum += mark;
	                }

	                double average = sum / 3.0;
	                System.out.println("Average marks of " + name + ": " + average);
	                System.out.println();

	            } catch (NumberFormatException e) {
	                System.out.println("java.lang.NumberFormatException: Please enter only integer values.");
	            } catch (InvalidMarkException e) {
	                System.out.println("Custom Exception: " + e.getMessage());
	            } catch (Exception e) {
	                System.out.println("Unexpected error: " + e.getMessage());
	            }
	        }

	        scanner.close();
	    }
	}

	

	


