import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		while(n-->0){
			long a=sc.nextLong();
			long b=a%10;
			a=a/10;
			long sum=0,ashik=1;
			while(a>0){
				long t=a%10;
				a=a/10;
				if(b==t){
					
				}else{
					sum=(b*ashik)+sum;
					ashik=ashik*10;
					b=t;
				}
			}
			sum=(b*ashik)+sum;
			System.out.println(sum);
		}
	}
}