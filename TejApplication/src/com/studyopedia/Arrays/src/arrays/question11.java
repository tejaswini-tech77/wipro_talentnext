package arrays;
import java.util.*;
public class question11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		boolean s=false;
		boolean k=false;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]!=4 && arr[i]!=1) {
				s=true;
				
			}
		}
		System.out.print(!s);

	}

}
