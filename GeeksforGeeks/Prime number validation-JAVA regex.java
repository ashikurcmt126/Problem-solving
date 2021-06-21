import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	Scanner sc=new  Scanner(System.in);
		int t=sc.nextInt();
		/*
		while(t-->0){
			int a=sc.nextInt();
			int k=0;
			int i;
			for(i=2;i<=a-1;i++){
				if(a%i==0){
					break;
				}
			}
			if(k==i){
				System.out.println("1");
			}
			else System.out.println("0");
		}*/
		while(t-->0){
			int a=sc.nextInt();
			int k=0;
			for(int j=2;j<=Math.sqrt(a);j++){
				if(a%j==0){
					k=1;
					break;
				}
			}
			if(k==1)System.out.println("0");
			else System.out.println("1");
		}
	}
}