public class SumDistink {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			int ashik[]=new int[100000];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				ashik[a[i]]++;
			}
			int sum=0;
			for(int i=0;i<n;i++){
				if(ashik[a[i]]>=1){
					sum+=a[i];
					ashik[a[i]]=0;
				}
			}
			System.out.println(sum);
			
		}
	}

}