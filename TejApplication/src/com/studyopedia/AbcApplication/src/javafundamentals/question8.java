package javafundamentals;
import java.util.*;
public class question8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.next().charAt(0);
		if(n>=48&& n<=57) {
			System.out.print("Digit");
			
		}
		else if(n>=65 && n<=90) {
			System.out.print("alphabet");
		}
		else if(n>=97 && n<=122) {
			System.out.print("alphabet");
		}
		else {
			System.out.print("Special Character");
		}
		

	}

}
