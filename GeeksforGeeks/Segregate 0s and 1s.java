public class Segregate {
	public static void main(String args[]){
		Scanner sc=new  Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			for(int i=0;i<n;i++)a[i]=sc.nextInt();
			int i=0,j=n-1,k=0;
			while(k<n){
				if(a[k]==0){
					b[i]=0;
					i++;
				}else{
					b[j]=1;
					j--;
				}
				k++;
			}
			for(int ii=0;ii<n;ii++){
				System.out.print(b[ii]+" ");
			}
			System.out.println();
			
		}
	}

}