package arrays;
import java.util.*;
public class question12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		int arr[]=new int[n-1];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr2[i]=sc.nextInt();
		}
		arr[0]=arr1[2];
		arr[1]=arr2[2];
		for(int i=0;i<n-1;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
