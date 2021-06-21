public class GCDArray {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			if(n==1){
				System.out.println(a[0]);
			}else{
				int gc=0;
				int ai=a[0];int bi=a[1];
				for(int i=1;i<=ai&&i<=bi;i++){
					if(ai%i==0&&bi%i==0){
						gc=i;
					}
				}
				ai=gc;
				for(int j=2;j<n;j++){
					bi=a[j];
					for(int i=1;i<=ai&&i<=bi;i++){
						if(ai%i==0&&bi%i==0){
							gc=i;
						}
					}
					ai=gc;
				}
				System.out.println(gc);
			}
		}
	}

}