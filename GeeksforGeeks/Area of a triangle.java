import java.util.*;
public class AreaTri {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			if((a+b)>c&&(b+c)>a&&(a+c)>b){
				double s=(a+b+c)/2.0;
				double s1=s*(s-a)*(s-b)*(s-c);
				double fr=Math.sqrt(s1);
				System.out.println(String.format("%.6f",fr));
			}
			else{
				System.out.println(0.000000);
			}
		}
	}

}