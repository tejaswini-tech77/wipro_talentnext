package arrays;
import java.util.*;
public class question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.print("The smallest numbers are "+arr[0]+" "+arr[1]);
		System.out.println();
		System.out.print("The largest numbers are "+arr[n-1]+" "+arr[n-2]);

	}

}
