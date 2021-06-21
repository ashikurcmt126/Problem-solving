import java.io.*;
import java.util.*;
import java.util.Scanner;
//import java.math.*;

public class Solution {
   
		
	static int i,j;
	static int A1(int n,int a[][]){
		int sum=0;
		for( i=0;i<n;i++){
	 		for( j=i;j<=i;j++){
	 			sum=sum+a[i][j];
	 		}
	 	}
		return sum;
	}
static 	int b=2;
	
	static int A2(int n,int a[][]){
		int sum=0;
		for(int i=0;i<n;i++)
	 		for(int j=0;j<n;j++){
	 			if(i==(n-1-j))
                    sum+=a[i][j];
                
	 		}
	 		return sum;
	}
    
    public static void main(String[] args) {
      
      Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		int a[][]=new int [t][t];
		for( i=0;i<t;i++){
			for(j=0;j<t;j++){
				a[i][j]=sc.nextInt();
			}
		}
		
		 int sum3=A1(t, a);
		 int sum4=A2(t,a);
		 System.out.println(Math.abs(sum3-sum4));
    }
}