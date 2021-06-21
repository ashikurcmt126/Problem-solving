public class PrimeFreque {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int k=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			int c=0;
			int count=1;
			int ashik=a[0];
			int i=0;
			for(i=1;i<n;i++){
				if(a[i]==ashik){
					count++;
				}else{
					if(isp(count)&&count>=k){
						c=1;
						System.out.print(a[i-1]+" ");
					}
					ashik=a[i];
					count=1;
				}
			}
			if(isp(count)&&count>=k){
				System.out.print(a[i-1]+" ");
			}
			if(c==0){
				System.out.print("-1");
			}
			System.out.println();
		}
	}

	private static boolean isp(int count) {
		if(count==1){
			return false;
		}
		for(int i=2;i<=Math.sqrt(count);i++){
			if(count%i==0){
				return false;
			}
		}
		return true;
	}

}