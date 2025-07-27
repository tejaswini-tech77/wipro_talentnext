package abstraction;
interface Test {
    int myFunction(int a, int b, int c);
}

public class lambdademo {
    public static void main(String[] args) {
        // Lambda for addition
        Test t1 = (a, b, c) -> a + b + c;

        // Lambda for multiplication
        Test t2 = (a, b, c) -> a * b * c;

        // Calling and printing results
        int result1 = t1.myFunction(2, 3, 4); // 2 + 3 + 4 = 9
        int result2 = t2.myFunction(2, 3, 4); // 2 * 3 * 4 = 24

        System.out.println("Result of t1 (Addition): " + result1);
        System.out.println("Result of t2 (Multiplication): " + result2);
    }
}
