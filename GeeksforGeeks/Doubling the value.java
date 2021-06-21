public class Doubling {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long n=sc.nextLong();
			long k=sc.nextLong();
			long a[]=new long[(int) n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextLong();
			}
			long ashik=0;
			for(int i=0;i<n;i++){
				if(k==a[i]){
					//ashik=k;
					k=k*2;
				}
			}
			System.out.println(k);
		}
	}

}
