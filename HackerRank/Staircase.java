import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int b=1;
		
		for(int i=n;i>=1;i--){
			for(int j=i;j>1;j--){
				System.out.print(" ");
				
			}
			for(int k=1;k<=b;k++){
				
				if(b==n+1){
					break;
				}
				System.out.print("#");
			}
			b++;
			System.out.println();
			
		}
    }
}