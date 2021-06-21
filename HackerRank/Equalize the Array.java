import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
          Scanner sc=new  Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];int i;
		for( i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int b=0;
		int first=a[0],count=0;
		for(i=0;i<a.length;i++){
			if(first==a[i]){
				count++;
			}
			else
			{
				first=a[i];
				count=1;
			}
			if(b<count){
				b=count;
			}
		}
		int output=a.length-b;
		System.out.println(output);
    }
}