public class fib {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int f0=1;
			int f1=1;
			int f2=0;
			if(n==1||n==2){
				System.out.println(1);
			}else{
				for(int i=1;i<n-1;i++){
					f2=(f0+f1)%1000000007;
					f0=f1%1000000007;
					f1=f2%1000000007;
				}
				System.out.println(f2%1000000007);
			}
		}
	}

}