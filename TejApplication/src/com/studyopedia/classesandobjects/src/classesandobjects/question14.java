package classesandobjects;
import java.util.*;
public class question14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1="";
		if(s.charAt(0)=='x' && (s.charAt(s.length()-1)=='x')) {
			s1+=s.substring(1,s.length()-1);
			System.out.print(s1);
		}
		else if(s.charAt(0)=='x') {
			s1+=s.substring(1,s.length());
			System.out.print(s1);
		}
		else if(s.charAt(s.length()-1)=='x') {
			s1+=s.substring(0,s.length()-1);
			System.out.print(s1);
		}
		else {
			System.out.print(s);
		}

	}

}
