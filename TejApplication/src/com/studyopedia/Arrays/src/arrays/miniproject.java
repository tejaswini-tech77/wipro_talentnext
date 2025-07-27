package arrays;
import java.util.*;
public class miniproject {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {1001,1002,1003,1004,1005,1006,1007};
		int index=-1;
		char ch1;
		int n=0;
		int k1=0;
		boolean s1=true;
		System.out.print("java project1"+" ");
		int k=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			if(k==arr[i]) {
				index=i;
				s1=false;
				k1=arr[i];
				
			}
			}
		}
		if(!s1) {
		System.out.print("Emp No"+" ");
		System.out.print("Emp Name"+" ");
		System.out.print("Department"+" ");
		System.out.print("Designation"+" ");
		System.out.print("Salary"+"  ");
		System.out.println();
		System.out.print(k1+"     ");
		String[] s= {"Ashish","Sushma","Rahul","chahat","Ranjan","suman","tanmay"};
        System.out.print(s[index]+"      ");
        String[] dep= {"R&D","PM","Acct","Front desk","Engg","Manufacturing","PM"};
        System.out.print(dep[index]+"      ");
        char []ch= {'e','c','k','r','m','e','c'};
        ch1=ch[index];
        switch(ch1) {
        case 'e':
        	   System.out.print("Engineer"+"      ");
        	   n=20000;
        	   break;
        case 'c':
        	   System.out.print("Consultant"+"      ");
        	   n=32000;
        	   break;
        case 'k':
        	   System.out.print("Clerk"+"     ");
        	   n=12000;
        	   break;
        case 'r':  
        	   System.out.print("Receptionist"+"      ");
        	   n=15000;
        	   break;
        case 'm':
        	   System.out.print("Manager"+"      ");
        	   n=40000;
        	   break;
        	    }
        int[] basic= {20000,30000,10000,12000,50000,23000,29000};
        int[] hra= {8000,12000,8000,6000,20000,9000,12000};
        int[] it= {3000,9000,1000,2000,20000,4400,10000};
      //  int[] da= {20000,32000,12000,15000,40000};
        int salary=basic[index]+hra[index]+n-it[index];
        System.out.print(salary);
		}
        if(s1) {
        	   System.out.print("There is no employee with empid: "+k);
        }
	}

}
