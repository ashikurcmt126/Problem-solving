public class identical {
	public static void main(String args[]){
		Scanner sc=new  Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++){
				b[i]=sc.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			int c=0;
			for(int i=0;i<n;i++){
				if(a[i]==b[i]){
					
				}else{
					c=1;
					break;
				}
			}
			if(c==1){
				System.out.println(0);
			}else{
				System.out.println(1);
			}
		}
	}

}