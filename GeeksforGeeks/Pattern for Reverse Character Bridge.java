public class PRCharBridge {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int rashid=-1;
			for(int i=1;i<=n;i++){
				rashid++;
				for(int j=n;j>=1;j--){
					if(j>=i){
						System.out.print((char)(65+n-j));
					}else{
						System.out.print(" ");
					}
				}
				if(i<=2){
					for(int k=n-1;k>=1;k--){
						System.out.print((char)(64+k));
					}
				}
				else{
					for(int k=2;k<=rashid;k++){
						System.out.print(" ");
					}
					for(int k=n-rashid;k>=1;k--){
						System.out.print((char)(64+k));
					}
				}
				
			System.out.println();	
			}
		}
	}

}