public class SquareDef {
	public static void main(String ars[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long n=sc.nextLong();
			long sum=0,sum1=0;
			for(int i=1;i<=n;i++){
				sum=sum+i;
				sum1=sum1+(i*i);
			}
			sum=sum*sum;
			System.out.println(Math.abs(sum1-sum));
			
		}
	}

}