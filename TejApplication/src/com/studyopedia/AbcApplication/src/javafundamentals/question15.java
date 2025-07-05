package javafundamentals;
import java.util.*;
public class question15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.print("not prime");
				break;
			}
			else {
				System.out.print("prime");
				break;
			}
		}

	}

}
