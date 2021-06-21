public class Pa {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int i=0;
			int k=1;
			int c=0;
			while(i<=n){
				i=i+k;
				if(i==n){
					 c=1;
					System.out.println("True");break;
				}
				k=i;
			}
			if(c==0){
				System.out.println("False");
			}
		}
	}

}