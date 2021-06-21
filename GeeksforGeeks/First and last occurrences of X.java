public class Occ {
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
			int c=0,d=0;
			int check=0,rashid=0;
			for(int i=0;i<n;i++){
				if(a[i]==k&&check==0){
					rashid=1;
					c=i;
					d=i;check=1;
				}
				else if(a[i]==k){
					d=i;
				}
			}
		if(rashid==1){
			System.out.println(c+" "+d);
		}else{
			System.out.println("-1");
		}
		}
	}

}