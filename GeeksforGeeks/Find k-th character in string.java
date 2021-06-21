public class FindCharString {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int m=sc.nextInt();
			int k=sc.nextInt();
			int n=sc.nextInt();
			String s=Integer.toBinaryString(m);
			String s1="";
			char ch[]=s.toCharArray();
			for(int i=0;i<n;i++){
				
				for(int j=0;j<ch.length;j++){
					if(ch[j]=='1'){
						s1=s1+"10";
					}else{
						s1=s1+"01";
					}
				}
				ch=s1.toCharArray();
				s1="";
				
			}
			System.out.println(ch[k]);
			
			
		}
	}

}