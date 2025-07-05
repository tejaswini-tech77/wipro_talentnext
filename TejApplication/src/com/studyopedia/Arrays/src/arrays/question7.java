package arrays;
import java.util.*;
public class question7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int[] unique=new int[n-1];
		int count=0;
		
		for(int i=0;i<n;i++) {
			boolean s=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					s=true;
					break;
				}
				
			}
			if(!s) {
				unique[count++]=arr[i];
			}
		}
		for(int i=0;i<n-1;i++) {
			System.out.print(unique[i]+" ");
		}

	}

}
