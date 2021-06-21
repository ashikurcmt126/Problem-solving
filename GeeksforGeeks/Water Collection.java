public class AccountOfWater {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)a[i]=sc.nextInt();
			
			int count=0;
			for(int i=1;i<n-1;i++){
				int amar=0,tomar=0;
				for(int j=0;j<=i;j++){
					amar=Math.max(amar,a[j]);
				}
				for(int j=n-1;j>=i;j--){
					tomar=Math.max(tomar,a[j]);
				}
				count+=Math.min(amar,tomar)-a[i];
			}
			System.out.println(count);
		}
	}

}