 * Bangladeshi
 */
import java.util.*;
public class StudentRecord {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			String s=sc.next();
			String fs=s;
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			Vector<String> v=new Vector<String>();
			v.add(s);
			int avg3 = 0;
			int avg=(a+b+c)/3;
			int fA=avg;
			if(n>=2){
				for(int i=1;i<n;i++){
					String s1=sc.next();
					a=sc.nextInt();
					b=sc.nextInt();
					c=sc.nextInt();
					int avg2=(a+b+c)/3;
					if(fA<avg2){
						v.clear();
						v.add(s1);
						fA=avg2;
					}
					else if(fA==avg2){
						v.add(s1);
						
					}
				}
				for(int i=0;i<v.size();i++){
					System.out.print(v.get(i)+" ");
				}
				System.out.println(fA);
				
			}else{
				
				System.out.println(v.get(0)+" "+fA);
			}
		
		}
	}

}