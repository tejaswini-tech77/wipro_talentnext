package javafundamentals;
import java.util.*;
public class question20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=n;
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(p==rev) {
			System.out.print(p+ " is a palindrome");
		}
		else {
			System.out.print(p+" is not a palindrome");
		}

	}

}
