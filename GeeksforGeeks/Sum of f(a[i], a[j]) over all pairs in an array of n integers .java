public class SumOfs {
	public static void main(String args[]){
		Scanner scs=new Scanner(System.in);
		int t=scs.nextInt();
		while(t-->0){
			int n=scs.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=scs.nextInt();
			}
			int sum=0;
			for(int i=0;i<n;i++){
				for(int j=i;j<n;j++){
					
					 if(Math.abs((a[j]-a[i]))>1){
						sum=sum+(a[j]-a[i]);
					}else if(Math.abs((a[j]-a[i]))<=1){
						sum=sum+0;
					}
				}
			}
			System.out.println(sum);
			
		}
	}

}