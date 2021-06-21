public class AbsoluteNumber {
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
			int Bangladesh=0;
			for(int i=0;i<n;i++){
				if(a[i]<k){
					if(line(a[i])==1){
						Bangladesh=1;
						System.out.print(a[i]+" ");
					}
				}
			}
			if(Bangladesh==0){
				System.out.print("-1");
			}
			System.out.println();
		}
	}

	private static int line(int i) {
		if(count(i)){
			return 1;
		}
		
		return 0;
	}
	/*
	 *8 54
      7 98 56 43 45 23 12 8
      7 43 45 23 12 8 
	 */
	private static boolean count(int i) {
		String s=Integer.toString(i);
		int l=s.length();
		if(l==1){
			return true;
		}
		int m,n;
		for(int j=1;j<l;j++){
			m=s.charAt(j-1)-48;
			n=s.charAt(j)-48;
			if(Math.abs(m-n)!=1){
				return false;
			}
		}
		return true;
		
	}

}