public class Fine {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int k=sc.nextInt();
			int car[]=new int[n];
			int pen[]=new int[n];
			for(int i=0;i<n;i++){
				car[i]=sc.nextInt();
				
			}
			for(int i=0;i<n;i++){
				pen[i]=sc.nextInt();
			}
			int sum=0;
			for(int i=0;i<n;i++){
				if(car[i]%2==1&&k%2==0){
					sum=sum+pen[i];
				}
				else if(car[i]%2==0&&k%2==1){
					sum=sum+pen[i];
				}
			}
			System.out.println(sum);
		}
	}

}