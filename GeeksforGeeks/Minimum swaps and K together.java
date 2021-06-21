public class MinimumSwap_2 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			int count=0;
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int k=sc.nextInt();
			for(int i=0;i<n;i++){
				if(a[i]<=k){
					count++;
				}
			}
			int fcount=0;
			int min=Integer.MAX_VALUE;
			
			for(int i=0;i<n-(count-1);i++){
				int ashik=0;
				for(int j=i;j<i+count;j++){
					if(a[j]<=k){
						ashik++;
					}
				}
				if(min>(count-ashik)){
					min=count-ashik;
				}
			}
			System.out.println(min);
		}
	}

}