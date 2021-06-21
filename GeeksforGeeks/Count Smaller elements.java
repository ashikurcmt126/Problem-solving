public class CountSmall {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n+1];
			
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					if(a[i]>a[j])b[i]++;
				}
			}
			for(int i=0;i<n;i++){
				System.out.print(b[i]+" ");
			}
			System.out.println();
		}
	}

}