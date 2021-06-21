import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0){
			String str=sc.next();
			int sum=0;
			for(int i=0;i<str.length();i++){
				sum=sum+(int)str.charAt(i);
			}
			double b=Math.sqrt(sum);
			int k=(int)b;
			
			if(sum==k*k){
				System.out.println("1");
			}else
				System.out.println("0");
		}
	}
}