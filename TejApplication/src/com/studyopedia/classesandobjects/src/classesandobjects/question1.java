package classesandobjects;
import java.util.*;
 class box {
	int width;
	int height;
	int depth;
	box(){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	public int display(int x,int y,int z) {
		int volume=x*y*z;
		return volume;
	}
 }
public class question1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		box a=new box();	
		int n=a.display(x,y,z);
		System.out.print(n);

	}

}
