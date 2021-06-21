public class SuffleInt {
	public static void main(String args[]){
		Scanner sc=new  Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int b=n/2;
			int k=0;
			if(n%2==0){
				for(int i=0;i<n;i++){
					if(i%2==0){
						System.out.print(a[k]+" ");k++;
					}else{
						System.out.print(a[b]+" ");
						b++;
					}
				}
			}
			else{
				for(int i=0;i<n-1;i++){
					if(i%2==0){
						System.out.print(a[k]+" ");k++;
					}else{
						System.out.print(a[b]+" ");
						b++;
					}
				}
				System.out.print(a[n-1]+" ");
			}
			System.out.println();
		}
	}

}