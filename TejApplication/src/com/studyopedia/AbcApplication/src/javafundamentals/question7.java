package javafundamentals;
import java.util.*;
public class question7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		char d=sc.next().charAt(0);
		if(c<d) {
			System.out.print(c +" "+d);
		}
		else {
			System.out.print(d +" "+c);
		}

	}

}
