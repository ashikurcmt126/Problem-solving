import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int k=n%10;
			while(n>9){
				n=n/10;
			}
			System.out.println(n+" "+k);
		}
	}
}