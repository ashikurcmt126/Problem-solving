public class LongestPrif {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			String s[]=new String[n];
			for(int i=0;i<n;i++){
				s[i]=sc.next();
			}
			int max=Integer.MAX_VALUE;
			for(int i=0;i<n;i++){
				if(s[i].length()<max){
					max=s[i].length();
				}
			}
			char ch=' ';
			int check=0,count=0,b=0,g=0;
			int ashikur=0;
			for(int i=0;i<max;i++){
				ch=s[0].charAt(i);
				for(int j=1;j<n;j++){
					if(ch==s[j].charAt(i)){
						count++;
					}else{
						b=1;
						break;
					}
				}
				if(count==n-1){
					ashikur=1;
					g++;
				}
				count=0;
				if(b==1)break;
			}
			if(ashikur==0){
				System.out.println("-1");
			}else{
				System.out.println(s[0].substring(0,g));
			}
		}
	}

}