import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		//int t=sc.nextInt();
		//System.out.printf("%02d",t);
		int year=sc.nextInt();
		int date,month=9;
		if(year>=1700&&year<=2700){
			if(year>1918){
				if(year%4==0&&year%100!=0||year%400==0){
					date=12;
					System.out.printf("%02d.%02d.%d", date,month,year);
				}
				else 
				{
					date=13;
					System.out.printf("%02d.%02d.%d", date,month,year);
				}
			}
			else if(year==1918){
				System.out.println("26.09.1918");
			}
			else if(year<1918){
				if(year%4==0){
					date=12;
					System.out.printf("%02d.%02d.%d", date,month,year);
				}
				else 
				{
					date=13;
					System.out.printf("%02d.%02d.%d", date,month,year);
				}
			}
		}
    }
}