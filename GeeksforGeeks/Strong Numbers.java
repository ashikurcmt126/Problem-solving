public class StrongNum {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int k=n;
			int sum=0;
			while(n!=0){
				int b=fac(n%10);
				//System.out.println(b);
				sum=sum+b;
				n=n/10;
			}
			if(sum==k){
				System.out.println("Strong");
			}else{
				System.out.println("Not Strong");
			}
		}
	}

	private static int fac(int i) {
		int facto=1;
		if(i==1){
			return 1;
		}else{
			for(int j=2;j<=i;j++){
				facto=facto*j;
			}
		}
		return facto;
	}

}