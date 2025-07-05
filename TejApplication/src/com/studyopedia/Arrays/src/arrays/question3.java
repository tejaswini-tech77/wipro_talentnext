package arrays;
import java.util.*;
public class question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		boolean s=true;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			if(arr[i]==m) {
				System.out.println(i);
				s=false;
			}
		}
		if(s) {
			System.out.println(-1);
		}
		

	}

}
