import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			double a,b;
			a=sc.nextDouble();
			b=sc.nextDouble();
			double d=a%b;
			d=Double.parseDouble(String.format("%.2f",d));
			System.out.println(d);
		}
	}
}