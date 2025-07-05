package arrays;
import java.util.*;
public class question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int avg=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		avg=(sum/n);
		System.out.println(sum);
		System.out.println(avg);
		

	}

}
