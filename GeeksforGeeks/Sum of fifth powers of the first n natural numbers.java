import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long n=sc.nextInt();
			long sum=0;
			for(int i=1;i<=n;i++){
				sum=sum+ (long)(Math.pow(i,5));
			}
			System.out.println(sum);
		}
	}
}