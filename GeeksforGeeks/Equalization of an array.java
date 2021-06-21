public class Equalition {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			int sum=0;
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				sum+=a[i];
			}
			int avg=sum/n;
			int sum2=0;
			if(avg*n!=sum){
				System.out.println("-1");
			}else{
				for(int i=0;i<n;i++){
					if(a[i]<avg){
						sum2+=avg-a[i];
					}
				}
				System.out.println(sum2);
			}
			
		}
	}

}