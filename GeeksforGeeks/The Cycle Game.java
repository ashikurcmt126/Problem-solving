public class TheCycleGame {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long x=sc.nextInt();
			long y=sc.nextInt();
			long z=sc.nextInt();
			long sum1=x,sum2=y;
			for(int i=1;i<=z;i++){
				if(i%2==1){
					sum1=sum1*2;
				}
				else{
					sum2=sum2*2;
				}
			}
			long fin=Math.max(sum1, sum2);
			long fin2=Math.min(sum1,sum2);
			System.out.println(fin/fin2);
			
			
		}
	}

}