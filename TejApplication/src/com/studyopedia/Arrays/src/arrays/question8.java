package arrays;
import java.util.*;
public class question8 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        int n = sc.nextInt();
		        int[] arr = new int[n];

		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }

		        int sum = 0;
		        int i = 0;

		        while (i < n) {
		            if (arr[i] == 6) {
		                int j = i + 1;
		                while (j < n && arr[j] != 7) {
		                    j++;
		                }
		                if (j < n && arr[j] == 7) {
		                   
		                    i = j + 1;
		                    continue;
		                } else {
		                   
		                    sum += arr[i];
		                    i++;
		                }
		            } else {
		                sum += arr[i];
		                i++;
		            }
		        }

		        System.out.println("Sum = " + sum);
		    }
		}
