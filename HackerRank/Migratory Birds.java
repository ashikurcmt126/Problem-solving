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
		for(i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int last=a[0];
		int count=0;int b=0;
		int k=0;
		for(i=0;i<a.length;i++){
			if(last==a[i]){
				count++;
			}
			else
			{
			
				last=a[i];
				if(b<count){
					b=count;
				}
				count=1;
				
			}
			if(b<count){
				k=a[i];
			}
		}
		System.out.println(k);
       
    }
}