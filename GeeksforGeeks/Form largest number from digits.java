public class LargeNumberDigit {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			int ch[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				ch[i]=a[i];
				
			}
			Arrays.sort(ch);
			for(int i=ch.length-1;i>=0;i--){
				System.out.print(ch[i]);
			}
			System.out.println();
		}
	}
	

}