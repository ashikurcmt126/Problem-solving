public class SmallReapted {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int k=sc.nextInt();
			int a[]=new int[n];
			int ashik[]=new int[100001];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				ashik[a[i]]++;
			}
			Arrays.sort(a);
			int rashid=0;
			for(int i=0;i<n;i++){
				if(ashik[a[i]]==k){
					System.out.println(a[i]);
					rashid=1;
					break;
				}
			}
			if(rashid==0){
				System.out.println("-1");
			}
		}
	}

}