package classesandobjects;
import java.util.*;
public class question10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		String s1="";
		String result="";
		for(int i=0;i<2;i++) {
			s1+=s.charAt(i);
		}
		for(int i=0;i<n;i++) {
			result+=s1;
		}
		System.out.print(result);

	}

}
