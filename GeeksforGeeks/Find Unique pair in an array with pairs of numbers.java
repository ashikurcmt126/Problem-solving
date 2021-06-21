public class UniqePair {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			int c=a[0];
			int ashik=1;
			for(int i=1;i<n;i++){
				if(c==a[i]){
					ashik++;
				}
				else{
					if(ashik==1){
						System.out.print(a[i-1]+" ");
					}
					c=a[i];
					ashik=1;
				}
			}
			if(ashik==1){
				System.out.print(a[a.length-1]);
			}
			
			System.out.println();
		}
	}

}