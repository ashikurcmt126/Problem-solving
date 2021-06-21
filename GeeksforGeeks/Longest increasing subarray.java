public class LongestIncresingSub {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int c=1,max=0;
			int ch=a[0];
			for(int i=1;i<n;i++){
				if(ch<a[i]){
					c++;
					//System.out.println(c);
					ch=a[i];
				}else{
					if(max<c){
						max=c;
					}
					c=1;
					ch=a[i];
				}
			}
			if(max<c){
				max=c;
			}
			System.out.println(max);
		}
	}

}