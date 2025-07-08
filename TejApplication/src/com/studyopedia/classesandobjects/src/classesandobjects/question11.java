package classesandobjects;
import java.util.*;
public class question11 {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    String result=getthestring(s);
	    System.out.print(result);
	}
	    public static String getthestring(String s) {
	    	if(s.length()%2!=0) {
	    		return "null";
	    }
	    	else {
	    		return s.substring(0, s.length()/2);
	    	}

	}

}
