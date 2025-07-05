package javafundamentals;

public class question16 {

	public static void main(String[] args) {
		
		for(int i=10;i<=99;i++) {
           boolean s=true;
        	  
           
		for(int k=2;k<i;k++) {
			if(i%k==0) {
				s=false;
				break;
			}

	}
		if(s) {
			System.out.println(i);
		}

}
}
}
