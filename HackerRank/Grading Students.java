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
			
			if(38<=a[i]&&a[i]<=40&&(40-a[i]<3)){
				a[i]=40;
				
			}
			else if(41<=a[i]&&a[i]<=45&&(45-a[i]<3)){
				a[i]=45;
				
			}
			else if(46<=a[i]&&a[i]<=50&&(50-a[i]<3)){
				a[i]=50;
				
			}
			else if(51<=a[i]&&a[i]<=55&&(55-a[i]<3)){
				a[i]=55;
				
			}
			else if(56<=a[i]&&a[i]<=60&&(60-a[i]<3)){
				a[i]=60;
				
			}
			else if(61<=a[i]&&a[i]<=65&&(65-a[i]<3)){
				a[i]=65;
				
			}
			else if(66<=a[i]&&a[i]<=70&&(70-a[i]<3)){
				a[i]=70;
				
			}
			else if(71<=a[i]&&a[i]<=75&&(75-a[i]<3)){
				a[i]=75;
				
			}
			else if(76<=a[i]&&a[i]<=80&&(80-a[i]<3)){
				a[i]=80;
				
			}
			else if(81<=a[i]&&a[i]<=85&&(85-a[i]<3)){
				a[i]=85;
				
			}
			else if((86<=a[i]&&a[i]<=90)&&(90-a[i]<3)){
				a[i]=90;
				
			}
			else if(91<=a[i]&&a[i]<=95&&(95-a[i]<3)){
				a[i]=95;
				
			}
			else if(96<=a[i]&&a[i]<=100&&(100-a[i]<3)){
				a[i]=100;
				
			}
			
		}
		for(i=0;i<n;i++){
			System.out.println(a[i]);
		}
        

    }
}