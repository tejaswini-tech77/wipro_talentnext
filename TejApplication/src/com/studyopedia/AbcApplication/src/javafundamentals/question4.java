package javafundamentals;
import java.util.*;
public class question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int k=0;
		int l=0;
		if(m>10)
		  k=m%10;
		else
		  k=m;
		if(n>10)
		  l=n%10;
		else
		  l=n;
		if(k==l) {
			System.out.print("True");
			
		}
		else {
			System.out.print("False");
		}
		

	}

}
