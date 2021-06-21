import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0){
			int b=sc.nextInt();
			int a[][]=new int[(b*2)-1][(b*2)-1];
			int k=b;
			int amar=0,tomar=(k*2)-2;
			while(b-->0){
				for(int i=0;i<(k*2)-1;i++){
					for(int j=0;j<(k*2)-1;j++){
						if((i==amar)||(i==tomar)||(j==amar)||(j==tomar)){
							if(a[i][j]==0){
								a[i][j]=b+1;
							}
						}
					}
				}
				amar++;
				tomar--;
				
			}
			for(int i=0;i<(k*2)-1;i++){
				for(int j=0;j<(k*2)-1;j++){
					System.out.print(a[i][j]);
				}
				System.out.println();
			}
			
		}
	}
}