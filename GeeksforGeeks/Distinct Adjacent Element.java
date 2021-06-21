public class DistinctAdja {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
			for(int i=0;i<n;i++){
				if(m.containsKey(a[i])){
					int ashik=m.get(a[i])+1;
					m.put(a[i],ashik);
				}else{
					m.put(a[i],1);
				}
			}
			int max=0;
			for(int i=0;i<n;i++){
				if(max<m.get(a[i])){
					max=m.get(a[i]);
				}
			}
			if(max>(n+1)/2)System.out.println("NO");else{
				System.out.println("YES");
			}
		}
	}

}