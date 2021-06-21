public class PrintPat {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int k=0;
			int ashik=1;
			int rashid=(n*n)+1;
			int l=n;
			int m=(n*2)-1;
			int p=rashid;
			for(int i=1;i<=n;i++){
				for(int j=0;j<n*2;j++){
					if(k>j){
						System.out.print("-");
					}else{
						if(j%2==0){
							System.out.print(ashik);
							ashik++;
						}else{
							System.out.print("*");
						}
						
					}
				}
				k+=2;
				if(i==1){
					for(int j=0;j<m;j++){
						if(j%2==0){
							System.out.print(rashid);
							rashid++;
						}
						else{
							System.out.print("*");
						}
					}
				}
				else{
					for(int j=0;j<m;j++){
						if(j%2==0){
							System.out.print(rashid);rashid++;
						}else{
							System.out.print("*");
						}
					}
				}
				m=m-2;
				rashid=p;
				rashid=rashid-(l-1);
				p=rashid;l--;
				
				System.out.println();
			}
		}
	}

}