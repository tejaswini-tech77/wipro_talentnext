package classesandobjects;
import java.util.*;
public class question12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1="";
        for(int i=1;i<s.length()-1;i++) {
        	s1+=s.charAt(i);
        }
        System.out.print(s1);
	}

}
