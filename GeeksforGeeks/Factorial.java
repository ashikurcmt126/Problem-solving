public class Fact {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long f=1;
			int n=sc.nextInt();
			if(n==0)System.out.println(1);
			else{
				for(int i=1;i<=n;i++){
					f=f*i;
				}
				System.out.println(f);
			}
		}
	}

}