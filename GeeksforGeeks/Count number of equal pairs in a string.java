import java.util.*;
public class PairString {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			int count=1;
			char ch[]=s.toCharArray();
			Arrays.sort(ch);
			
			int fcount=1;
			
			 char Bangladesh=ch[0];
			for(int i=1;i<s.length();i++){
				if(Bangladesh==ch[i]){
					count++;
				}else{
					fcount=fcount+(count*count);
					//System.out.println(count);
				count=1;
				Bangladesh=ch[i];
				}
			}
			fcount=fcount+(count*count);
			System.out.println(fcount-1);
			
		}
	}

}