package javafundamentals;
import java.util.*;
public class question9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		if(s.equals("female")) {
			if(n>=1 && n<=58) {
				System.out.print("The percentage of interest is 8.2%");
			}
			else if(n>=59 && n<=100) {
				System.out.print("The percentage of interest is 9.2%");
			}
		}
		if(s.equals("male")) {
				if(n>=1 && n<=58) {
					System.out.print("The percentage of interest is 8.4%");
				}
				else if(n>=59 && n<=100) {
					System.out.print("The percentage of interest is 10.5%");
				}
		}

	}

}
