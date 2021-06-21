public class CeilTheFlor2 {
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
			Arrays.sort(a);
			int ashik=0;
			if(k<a[0]){
				ashik=1;
				System.out.println("Floor doesn't exist");
				System.out.println(a[0]);
			}
			else if(a[n-1]<k){
				ashik=1;
				System.out.println(a[n-1]);
				System.out.println("Ceil doesn't exist");
			}
			if(ashik==0){
				for(int i=0;i<n-1;i++){
					if(a[i]==k){
						System.out.println(a[i]);
						System.out.println(a[i]);break;
					}
					if(a[i]<k&&k<a[i+1]){
						//System.out.println("A");
						System.out.println(a[i]);
						System.out.println(a[i+1]);break;
					}
				}
			}
			if(a[n-1]==k){
				System.out.println(a[n-1]);
				System.out.println(a[n-1]);
			}
		}
	}

}