public class absoluteValue {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			HashSet<Integer> map=new HashSet<Integer>();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				map.add(Math.abs(a[i]));
			}
			System.out.println(map.size());
			
			
		}
	}

}