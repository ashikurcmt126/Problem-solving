import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		int k=sc.nextInt();
		int b=sc.nextInt();
		int a[]=new int[k];
		
		int i,j;
		for(i=0;i<k;i++){
			a[i]=sc.nextInt();
		}
		int p=0;
		for(i=0;i<k;i++){
			for(j=i+1;j<k;j++){
				if((a[i]+a[j])%b==0){
					p++;
					
				}
			}
		}
		System.out.println(p);
    }
}