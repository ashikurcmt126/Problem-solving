public class QuickRot {
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
			int b=(k)%n;
			int ashik=1;
			while(true){
				System.out.print(a[b%n]+" ");
				b++;
				ashik++;
				if(ashik>n){
					break;
				}
			}
			System.out.println();
		}
	}

}