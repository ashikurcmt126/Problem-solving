public class MaxiOccor {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			char ch[]=s.toCharArray();
			Arrays.sort(ch);
			char c[]=new char[26];
			int max=0;char ashik=' ';
			for(int i=0;i<ch.length;i++){
				c[ch[i]-97]++;
				if(max<c[ch[i]-97]){
					ashik=ch[i];
					max=c[ch[i]-97];
				}
			}
			System.out.println(ashik);
		}
	}

}
