public class EqualSum {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int count=0;
			int sum=0,mul=1;
			for(int i=0;i<n;i++){
				sum=0;mul=1;
				sum=sum+a[i];mul*=a[i];
				if(sum==mul){
					count++;
				}
				for(int j=i+1;j<n;j++){
					if((sum=sum+a[j])==(mul*=a[j])){
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

}