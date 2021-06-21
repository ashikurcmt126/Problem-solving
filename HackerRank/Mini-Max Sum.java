import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        
		Scanner sc=new Scanner(System.in);
		long sum=0;
		long mini=0;
		long max=0;
		
		//int n=sc.nextInt(); 
		long  a[]=new long [5];
		int i;
		for(i=0;i<a.length;i++){
			a[i]=sc.nextLong();
			sum=sum+a[i];
		}
	Arrays.sort(a);
	mini=sum-a[4];
	max=sum-a[0];
	System.out.println(mini+ " "+max);
    }
}