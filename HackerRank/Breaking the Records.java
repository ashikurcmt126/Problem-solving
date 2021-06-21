import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
		int n;
		n=sc.nextInt();
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int p=0,ni=0;
		int item=a[0];
		for(i=1;i<n;i++){
			
			//int k=0;
			if(item<a[i]){
				p++;
				item=a[i];	
			}
			
		}
		item=a[0];
		for(i=1;i<n;i++){
			
			//int k=0;
			if(item>a[i]){
				ni++;
				item=a[i];	
			}
			
		}
		System.out.println(p+" "+ni);
    }
}