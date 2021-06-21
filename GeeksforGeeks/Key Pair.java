public class KeyPair {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int k=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)a[i]=sc.nextInt();
			int check=0;
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(i!=j){
						if(a[i]+a[j]==k){
							check=1;
							System.out.println("Yes");break;
						}
					}
				}
				if(check==1)break;
			}
			if(check==0)System.out.println("No");
		}
	}

}