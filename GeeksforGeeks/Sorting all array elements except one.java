public class ExceptOne {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int m=sc.nextInt();
			int temp=0;
			for(int i=0;i<n-1;i++){
				for(int j=i+1;j<n;j++){
					if(i==m||j==m){
						
					}else if(a[i]>a[j]){
						temp=a[j];
						a[j]=a[i];
						a[i]=temp;
					}
				}
			}
			for(int i=0;i<n;i++){
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
	}

}