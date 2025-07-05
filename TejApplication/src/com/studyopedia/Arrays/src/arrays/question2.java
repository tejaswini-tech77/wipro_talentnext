package arrays;
import java.util.*;
public class question2 {

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
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++)
				if(arr[i]>=arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		}
		System.out.println("The minimum number is "+arr[0]);
		System.out.println("The maximmum number is "+arr[n-1]);
		

	}

}
