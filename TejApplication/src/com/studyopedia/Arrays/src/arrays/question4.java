package arrays;
import java.util.*;
public class question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//char[] ch=new char[n];
		char[] ah1=new char[n];
		for(int i=0;i<n;i++) {
			ah1[i]=(char)arr[i];
			System.out.print(ah1[i]+" ");
		}
		
		

	}

}
