public class LastDuplicate {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int c=0,b=1;
			int check=0;
			int temp=0;
			for(int i=0;i<n-1;i++){
				if(a[i]==a[i+1]){
					check=1;
					temp=a[i];
					c=i+1;
				}else{
					b=i+2;
				}
			}
			if(check==0){
				System.out.println(-1);
			}else{
				System.out.println(c+" "+temp);
			}
			
		}
	}

}