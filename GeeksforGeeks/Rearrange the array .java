public class RearrangeTheArr {
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
			int k=0;int l=n-1;
			for(int i=0;i<n;i++){
				if(i%2==0){
					System.out.print(a[k]+" ");k++;
				}else{
					System.out.print(a[l]+" ");l--;
				}
			}
			System.out.println();
		}
	}

}