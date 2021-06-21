public class EvenFactor {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int sum=0;
			
			int n=sc.nextInt();
			if(n%2==0){
				for(int i=2;i<=n/2;i++){
					
					if(n%i==0&&i%2==0){
						sum=sum+i;
					}
				}
				
					System.out.println(sum+n);
				
			}else{
		System.out.println(0);
			}
		}
	}

}