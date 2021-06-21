import java.util.*;
public class InvertedTringle {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int k=0,l=(n*2)-1;int g=1;
			for(int i=0;i<n;i++){
				
				for(int j=0;j<(n*2-1);j++){
					if(j>=k&&j<=l){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				k++;
				if(g==1){
					g=0;
					l=l-2;
				}else{
					l--;
				}
				
			}
			System.out.println();
		}
	}

}