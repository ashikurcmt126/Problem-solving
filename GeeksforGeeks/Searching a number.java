public class SearchNum {
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
			int ashik=0;
			for(int i=0;i<n;i++){
				if(a[i]==k){
					ashik=1;
					System.out.println(i+1);break;
				}
			}
			if(ashik==0){
				System.out.println("-1");
			}
		}
	}

}
