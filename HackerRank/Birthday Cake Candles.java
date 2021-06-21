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
	int max=0;
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
		
		if(max<a[i])
		{
			max=a[i];
		}
	}
	//System.out.println(max);
	int count=0;
	
	for(i=0;i<n;i++){
		if(a[i]==max){
			count++;
		}
	}
	System.out.println(count);
       
    }
}