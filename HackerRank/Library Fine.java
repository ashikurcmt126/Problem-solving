import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
		int Ad=sc.nextInt();
		int Am=sc.nextInt();
		int Ay=sc.nextInt();
		int Ed=sc.nextInt();
		int Em=sc.nextInt();
		int Ey=sc.nextInt();
		int fees=0;
		if(Ed==Ad&&Em==Am&&Ey==Ay){
			fees=0;
		}
		else if(Ad>Ed&&Em==Am&&Ey==Ay){
			int b=Ad-Ed;
			fees=15*b;
		}
		else  if((Ad>Ed||Ad==Ed||Ad<Ed)&&(Em<Am)&&(Ey==Ay)){
			int b=Am-Em;
			fees=500*b;
		}
		else if((Ad>Ed||Ad==Ed||Ad<Ed)&&(Em<Am||Em==Am||Em>Am)&&Ey<Ay){
			
			fees=10000;
		}
		System.out.println(fees);
    }
}