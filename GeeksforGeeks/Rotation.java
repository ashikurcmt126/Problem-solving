public class Rotation {
	public static void main(String args[]){
		Scanner sc=new  Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int c=0;
			int check=0;
			for(int i=0;i<n-1;i++){
				if(a[i]<=a[i+1]){
					c++;
				}else{
					c++;
					check=1;break;
				}
			}
			if(check==1){
				System.out.println(n-(n-c));
			}else{
				System.out.println(0);
			}
		}
	}

}