import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
		int s=sc.nextInt();
		int t=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		int p=0;
		int ni=0;
		int l;
		
		int i;
		for(i=0;i<m;i++){
			 l=sc.nextInt();
			int k=a+l;
			
			if(s<=k&&k<=t){
				p++;
			}
		}
		
		for(i=0;i<n;i++){
			int li=sc.nextInt(); 
			int ki=b+li;
			
			if(s<=ki&&ki<=t){
				ni++;
			}
		}
		System.out.println(p);
        System.out.println(ni);
        
    }
}