public class FindMinMax {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
			for(int i=0;i<n;i++){
				if(a[i]>max){
					max=a[i];
				}
				if(a[i]<min){
					min=a[i];
				}
			}
			System.out.println(min+" "+max);
		}
	}

}