public class CommonDelete {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			int a[]=new int[26];
			int b[]=new int[26];
			for(int i=0;i<s.length();i++){
				a[s.charAt(i)-97]++;
			}
			for(int i=0;i<s1.length();i++){
				b[s1.charAt(i)-97]++;
			}
			int c=0;
			String s2="";
			for(int i=0;i<s.length();i++){
				if(b[s.charAt(i)-97]>=1){
					
				}else{
					c=1;
					s2=s2+s.charAt(i);
				}
			}
			for(int i=0;i<s1.length();i++){
				if(a[s1.charAt(i)-97]>=1){
					
				}else{
					c=1;
					s2=s2+s1.charAt(i);
				}
			}
			
			if(c==0){
				System.out.println("-1");
			}else{
				System.out.println(s2);
			}
		}
	}

}
