public class StringCommon {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			String s2="";
			char c[]=s1.toCharArray();
			Arrays.sort(c);
			int cap[]=new int[26];
			int sma[]=new int[26];
			for(int i=0;i<s.length();i++){
				if(Character.isUpperCase(s.charAt(i))){
					cap[s.charAt(i)-65]++;
				}
				else{
					sma[s.charAt(i)-97]++;
				}
			}
			for(int i=0;i<c.length;i++){
				if(Character.isUpperCase(c[i])){
					if(cap[c[i]-65]>=1){
						s2+=c[i];
						cap[c[i]-65]=0;
					}
				}else{
					if(sma[c[i]-97]>=1){
						s2+=c[i];
						sma[c[i]-97]=0;
					}
				}
			}
			if(s2.length()>0){
				System.out.println(s2);
			}else{
				System.out.println("nil");
			}
		}
	}

}