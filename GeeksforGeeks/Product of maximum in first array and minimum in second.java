import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n1=sc.nextInt();
			int a1[]=new int[n1];
			for(int i=0;i<n1;i++)
				a1[i]=sc.nextInt();
			int n2=sc.nextInt();
			int a2[]=new int[n2];
			for(int i=0;i<n2;i++)
				a2[i]=sc.nextInt();
			
			int max1=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
			for(int i=0;i<n1;i++){
				if(max1<a1[i]){
					max1=a1[i];
				}
			}
			for(int i=0;i<n2;i++){
				if(min>a2[i]){
					min=a2[i];
				}
			}
			System.out.println(max1*min);
		}
	
	}
}