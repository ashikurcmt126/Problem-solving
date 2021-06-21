public class gcd {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int c=a[0];int ashik=0;
			for(int i=1;i<n;i++){
				c=gcd(a[i],c);
				
			}
			System.out.println(c);
			
		}
	}

	private static int gcd(int i, int c) {
		int temp;
		while(c!=0){
			temp=i%c;
			i=c;
			c=temp;
		}
		return i;
	}

}