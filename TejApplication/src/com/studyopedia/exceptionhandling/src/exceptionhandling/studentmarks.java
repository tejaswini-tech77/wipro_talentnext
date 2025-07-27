package exceptionhandling;

import java.util.Scanner;

class InvalidMarkException extends Exception {
 public InvalidMarkException(String message) {
     super(message);
 }
}

public class studentmarks {
   public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     final int STUDENT_COUNT = 2;
     final int SUBJECT_COUNT = 3;

     for (int i = 1; i <= STUDENT_COUNT; i++) {
         try {
             System.out.print("Enter the name of student " + i + ": ");
             String name = scanner.nextLine();

             int[] marks = new int[SUBJECT_COUNT];
             int sum = 0;

             for (int j = 0; j < SUBJECT_COUNT; j++) {
                 System.out.print("Enter mark " + (j + 1) + " (0-100): ");
                 String input = scanner.nextLine();

                 int mark = Integer.parseInt(input); 
                 if (mark < 0) {
                     throw new InvalidMarkException("Negative marks are not allowed.");
                 } else if (mark > 100) {
                     throw new InvalidMarkException("Marks must be in the range 0-100.");
                 }

                 marks[j] = mark;
                 sum += mark;
             }

             double average = sum / (double) SUBJECT_COUNT;
             System.out.println("Average marks of " + name + " = " + average + "\n");

         } catch (NumberFormatException e) {
             System.out.println("java.lang.NumberFormatException: Please enter valid integers only.\n");
             i--; 
         } catch (InvalidMarkException e) {
             System.out.println("Custom Exception: " + e.getMessage() + "\n");
             i--; 
         } catch (Exception e) {
             System.out.println("Unexpected error: " + e.getMessage() + "\n");
             i--; 
         }
     }

     scanner.close();
 }
}

