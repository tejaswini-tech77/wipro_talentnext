package javafundamentals;
import java.util.*;
public class question10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char s=sc.next().charAt(0);
		
		if(s>=65 && s<=90) {
			
			System.out.print((char)(s+32));
		}
		else if(s>=97 && s<=122) {
			System.out.print((char)(s-32));
		}

	}

}
