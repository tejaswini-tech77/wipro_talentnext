package arrays;
import java.util.*;
public class question13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[] []arr=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=m-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
