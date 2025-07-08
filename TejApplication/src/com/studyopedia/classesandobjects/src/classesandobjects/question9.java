package classesandobjects;
import java.util.*;
public class question9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String t=sc.next();
		a=a.toLowerCase();
		t=t.toLowerCase();
		 a = a.replaceAll("[^a-z]", "");
	     t = t.replaceAll("[^a-z]", "");
		String b="";
		if(a.charAt(a.length()-1)==t.charAt(0) ) {
			b=a+t.substring(1);
		}
		else {
			System.out.print(a+" "+t);
		}
		System.out.print(b);

	}

}
