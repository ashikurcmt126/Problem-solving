public class LargestElement {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			int max=Integer.MIN_VALUE;
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				if(a[i]>max){
					max=a[i];
				}
			}
			System.out.println(max);
			
		}
	}

}