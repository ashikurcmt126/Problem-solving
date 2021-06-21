import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
		int search=sc.nextInt();
		int n=sc.nextInt();
		int a[]=new int[n];
		int b=0;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++){
			if(a[j]==search){
				b=j;
				break;
			}
		}
		System.out.println(b);
    }
}