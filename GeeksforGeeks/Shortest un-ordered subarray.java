public class ShortestUnOrder {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			/*
			 * 7 9 10 8 11
			 * 3
			 */
			int result=0;
			for(int i=0;i<n-2;i++){
				if(a[i]>a[i+1]&&a[i+1]<a[i+2]){
					result=3;break;
				}
				else if(a[i]<a[i+1]&&a[i+1]>a[i+2]){
					result=3;break;
				}
			}
			System.out.println(result);
		}
	}

}
