
import java.util.*;
public class Unusual {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			char c[]=s.toCharArray();
			Arrays.sort(c);
			int k=-1,b=-1;
			String s1="";
			String s2="";
			
			for(int i=0;i<c.length;i++){
				if(c[i]>=65&&c[i]<=90){
					s1+=c[i];
				}else{
					s2+=c[i];
				}
			}
			int i=0;
			String s3="";
//			System.out.println(s1);
//			System.out.println(s2);
			while(i<s.length()){
				if(k+1<s1.length()){
					k++;s3+=s1.charAt(k);i++;
				
				}
				if(b+1<s2.length()){
					b++;s3+=s2.charAt(b);i++;
					
				}
			}
			System.out.println(s3);
			
		}
	}

}