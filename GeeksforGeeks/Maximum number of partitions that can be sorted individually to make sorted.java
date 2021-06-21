public class MaxNumPart {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int ashik=0;
			int count=0;
			int b=0;
			for(int i=0;i<n;i++){
				b=Math.max(b,a[i]);
				if(b==i){
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
