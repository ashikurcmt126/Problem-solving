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
		int i,j,count=0,k=0;
		for(i=0;i<n;i++){
			count=0;
			int a=sc.nextInt();
			int b=sc.nextInt();
			int s;
			for(j=a;j<=b;j++){
				
				double  ki=Math.sqrt(j);
				s=(int )(ki);
				if(s*s==j){
					count++;
					
					j=j+(s*2);
				}
			
			}
			System.out.println(count);
		}	
    }
}