package classesandobjects;
import java.util.*;
class calculator {
	public int powerint(int num1,int num2) {
		int ans1=(int)Math.pow(num1, num2);
		return ans1;
		
	}
	public double powerdouble(double num1,int num2) {
		double ans2=Math.pow(num1, num2);
		return ans2;
	}
}
public class question2{
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		calculator c=new calculator();
		int n=sc.nextInt();
		int p=sc.nextInt();
		int a=c.powerint(n, p);
		double b=c.powerdouble(n, p);
		System.out.println(a);
		System.out.println(b);
		
		
		

	}

}
