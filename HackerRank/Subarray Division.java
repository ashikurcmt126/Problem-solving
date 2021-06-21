import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int count=0;
		int d=sc.nextInt();
		int m=sc.nextInt();
		for(i=0;i<a.length;i++){
			int limit=i+m;
			if(n<limit){
				break;
			}
			int sum=0;
			for(int j=i;j<limit;j++){
				sum=sum+a[j];
			}
			if(sum==d){
				count++;
			}
		}
		System.out.println(count);
        
    }
}