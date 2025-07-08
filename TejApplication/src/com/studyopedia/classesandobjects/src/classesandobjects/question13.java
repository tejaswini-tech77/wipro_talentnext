package classesandobjects;
import java.util.*;
public class question13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		String k="";
		if(s.length()<t.length()) {
			k=s+t+s;
		}
		else {
			k=t+s+t;
		}
		System.out.print(k);

	}

}
