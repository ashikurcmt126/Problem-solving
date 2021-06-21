public class AlterNativBit {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int rashid=sc.nextInt();
			for(int j=1;j<=rashid;j++){
				int n=j;
				
				int g=0,check=0;
				int l=n%2;
				int i=0;
				while(n!=0){
					int b=n%2;
					if(i%2==0&&b==l){
						
					}
					else if(i%2==1&&b!=l){
						
					}else{
						check=1;
						break;
					}
					n/=2;i++;
					
				}
				
				if(check==0){
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}

}