package classesandobjects;
import java.util.*;
public class question8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String abc=sc.nextLine();
		String rev="";
		for(int i=abc.length()-1;i>=0;i--) {
			rev+=abc.charAt(i);
		}
		if(abc.equals(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}

	}

}
