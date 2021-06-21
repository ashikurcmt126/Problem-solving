public class FindUniqe {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int a[]=new int[n];
			int ashik[]=new int[10001];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				ashik[a[i]]++;
			}
			int count=0;
			for(int i=0;i<n;i++){
				if(ashik[a[i]]==1){
					System.out.println(a[i]);break;
				}
			}
		}
	}

}