import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
		String time=sc.next();
		String pia[]=time.split(":");
		int h,m,s;
		h=Integer.parseInt(pia[0]);
		m=Integer.parseInt(pia[1]);
		s=Integer.parseInt(pia[2].substring(0,2));
		String bela=pia[2].substring(2,4);
		//System.out.println(bela);
		 String checkPM = "PM",checkAM ="AM";
		if(bela.equals(checkAM)&&h==12){
			h=0;
		}
		else if(bela.equals(checkPM)&&h<12){
			h=h+12;
		}
		System.out.printf("%02d:%02d:%02d",h,m,s);
    }
}