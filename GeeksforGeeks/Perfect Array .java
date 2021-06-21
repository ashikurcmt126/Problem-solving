public class PerfectArray {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n+1];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			
			if(check(a,n)){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}

	private static boolean check(int[] a, int n) {
		int i=1;
		
		while(a[i-1]<a[i]&&i<n){
			
			++i;
		}
		while(a[i-1]==a[i]&&i<n){
			
			++i;
		}
		while(a[i-1]>a[i]&&i<n){
		
			++i;
		}
		if(i==n){
			return true;
		}
		return false;
	}

}
