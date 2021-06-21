import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		while(n>0){
			long a=sc.nextLong();
			long sum=0;
			while(a>0){
				sum=sum+(a*2);
				a=a/2;
			}
			System.out.println(sum);
			n--;
		}
	}
}