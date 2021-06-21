import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
	        int a0 = in.nextInt();
	        int a1 = in.nextInt();
	        int a2 = in.nextInt();
	        int b0 = in.nextInt();
	        int b1 = in.nextInt();
	        int b2 = in.nextInt();
	        
	        int k=0,l=0;
	        
	        if(a0>b0){
	            k++;  
	        }
	        else if (a0==b0){
	            
	        }
	        else
	        {
	        	l++;
	        }
	        
	        if(a1>b1){
	            k++;  
	        }
	        else if (a1==b1){
	            
	        }
	        else
	        {
	        	l++;
	        }
	        
	        if(a2>b2){
	            k++;  
	        }
	        else if (a2==b2){
	            
	        }
	        else
	        {
	        	l++;
	        }
	        
	        System.out.println(k+" "+l);
        
    }
}