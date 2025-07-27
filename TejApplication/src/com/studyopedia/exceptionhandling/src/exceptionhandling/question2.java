package exceptionhandling;

public class question2 {
	    public static void main(String[] args) {
	        try {

	            if (args.length != 5) {
	                throw new IllegalArgumentException("Exactly 5 integers are required.");
	            }

	            int[] numbers = new int[5];
	            int sum = 0;

	            // Convert strings to integers and calculate sum
	            for (int i = 0; i < 5; i++) {
	                numbers[i] = Integer.parseInt(args[i]);
	                sum += numbers[i];
	            }

	            // Calculate average
	            int average = sum / numbers.length;

	            // Display results
	            System.out.println("Sum of array elements: " + sum);
	            System.out.println("Average of array elements: " + average);

	        } catch (NumberFormatException e) {
	            System.out.println("java.lang.NumberFormatException: Please enter valid integers.");
	        } catch (ArithmeticException e) {
	            System.out.println("java.lang.ArithmeticException: " + e.getMessage());
	        } catch (IllegalArgumentException e) {
	            System.out.println("java.lang.IllegalArgumentException: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("java.lang.Exception: " + e.getMessage());
	        }
	    }
	}



