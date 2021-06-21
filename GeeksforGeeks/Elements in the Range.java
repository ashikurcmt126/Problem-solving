public class ElementRange {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			int ar[]=new int[n];
			for(int i=0;i<n;i++){
				ar[i]=sc.nextInt();
			}
			int k=(b-a)+1;
			int count=0;
			for(int i=0;i<n;i++){
				if(ar[i]>=a&&ar[i]<=b){
					count++;
				}
			}
			if(count==k){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}

}