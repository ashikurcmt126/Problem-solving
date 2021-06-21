public class CheckPrm {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int f0=1;
			int f1=1;
			int f2=0;
			int c=0;
			if(n==1||n==2){
				c=1;
				System.out.println("Yes");
			}else{
				while(true){
					f2=f0+f1;
					if(f2==n){
						System.out.println("Yes");c=1;
						break;
					}
					if(f2>n)break;
					f0=f1;
					f1=f2;
					
				}
			}
			
			if(c==0){
				System.out.println("No");
			}
		}
	}

}