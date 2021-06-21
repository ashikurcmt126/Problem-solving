public class sunset {
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
			int max=a[0];
			for(int i=0;i<n;i++){
				if(max<a[i]){
					count++;
					max=a[i];
				}
				
			}
			System.out.println(count+1);
		}
	}

}