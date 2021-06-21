public class PN {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			int ashikur[]=new int[n/2];
			int rashid[]=new int[n/2];
			int d=0,r=0;
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				if(a[i]>0){
					ashikur[d]=a[i];d++;
				}else{
					rashid[r]=a[i];r++;
				}
			}
			d=0;r=0;
			for(int i=0;i<n;i++){
				if(i%2==0){
					System.out.print(ashikur[d]+" ");d++;
				}else{
					System.out.print(rashid[r]+" ");r++;
				}
			}
			System.out.println();
			
			
		}
	}

}