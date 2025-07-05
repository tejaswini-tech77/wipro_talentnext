package javafundamentals;
import java.util.*;
public class question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.isEmpty()) {
			System.out.println("No values");
		}
		else {
			String[] v=s.split(" ");
			for(int i=0;i<v.length;i++) {
				System.out.print(v[i]);
			
			if(i<v.length-1) {
				System.out.print(",");
			}
			}
			
		}
		

	}

}
