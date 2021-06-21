import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0){
			int a=sc.nextInt();
			int arr1[]=new int[a];
			int arr2[]=new int[a];
			for(int i=0;i<a;i++){
				arr1[i]=sc.nextInt();
			}
			for(int i=0;i<a;i++){
				arr2[i]=sc.nextInt();
			}
			
			int max1=0,max2=0;
			for(int i=0;i<a;i++){
				if(arr1[i]>arr2[i]){
					max1++;
				}
				else if(arr1[i]<arr2[i]){
					max2++;
				}
			}
			if(max1>max2){
				System.out.println(max1+" "+max2+" "+"A");
			}
			else if(max1<max2){
				System.out.println(max1+" "+max2+" "+"B");
			}
			else if(max1==max2){
				System.out.println(max1+" "+max2+" "+"DRAW");
			}
		}
	}
}