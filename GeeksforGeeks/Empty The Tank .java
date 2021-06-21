public class EmptyTa {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int b=sc.nextInt();
			
			int sum=n;
			int ashikur=1,ras=1;
			while(sum!=0){
				if(ashikur%2==1){
					sum=sum-(ras);
					ras++;
					if(sum<0){
						sum=0;
					}
					
				}else{
					sum=sum+b;
					if(sum>n){
						sum=n;
					}
				}
				
				ashikur++;
			}
			System.out.println(ashikur/2);
		}
	}

}