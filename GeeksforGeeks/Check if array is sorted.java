public class Sor {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int b=a[0];int c=0;
			for(int i=1;i<n;i++){
				if(b<=a[i]){
					c++;
				}
			}
			if(c+1==n){
				System.out.println(1);
			}else{
				System.out.println(0);
			}
		}
	}

}