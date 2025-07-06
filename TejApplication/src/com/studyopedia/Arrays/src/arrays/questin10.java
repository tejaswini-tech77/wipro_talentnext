package arrays;
import java.util.*;
public class questin10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] result=new int[n];
		int index=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				result[index++]=arr[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0) {
				result[index++]=arr[i];
			}
		}
		for(int i=0;i<n;i++) {
			arr[i]=result[i];
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
