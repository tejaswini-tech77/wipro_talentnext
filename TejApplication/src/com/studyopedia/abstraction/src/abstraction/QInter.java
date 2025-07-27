package abstraction;
interface Test {
    int myFunction(int a, int b, int c);
}
public class QInter {
	public static void main(String[] args) {
        Test t1 = (a, b, c) -> a + b + c;
        Test t2 = (a, b, c) -> a * b * c;
        int result1 = t1.myFunction(2, 3, 4); 
        int result2 = t2.myFunction(2, 3, 4); 
        System.out.println("Result of t1 (Addition): " + result1);
        System.out.println("Result of t2 (Multiplication): " + result2);
	}
}
