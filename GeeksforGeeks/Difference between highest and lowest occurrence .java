public class HighLowOccDif {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			int ashik[]=new int[100001];
			int max=Integer.MIN_VALUE;
			int min=Integer.MAX_VALUE;
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				ashik[a[i]]++;
				max=Math.max(max,ashik[a[i]]);
				
			}
			for(int i=0;i<n;i++){
				min=Math.min(ashik[a[i]],min);
			}
			
			System.out.println(max-min);
			
		}
	}

}