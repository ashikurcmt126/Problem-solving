public class RearrangeTheArray_3 {
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
			int k=0,b=n-1;
			for(int i=0;i<n;i++){
				if(i%2!=0){
					System.out.print(a[b]+" ");
					b--;
				}else
				{
					System.out.print(a[k]+" ");
					k++;
				}
			}
			System.out.println();
		}
		
	}

}