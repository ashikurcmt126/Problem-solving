public class exceptTwice {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Map<Integer,Integer> map=new HashMap<Integer,Integer>();
			for(int i=0;i<n;i++){
				if(map.containsKey(a[i])){
					int x=map.get(a[i])+1;
					map.put(a[i],x);
				}else{
					map.put(a[i],1);
				}
			}
			for(int i=0;i<n;i++){
				if(map.get(a[i])==1){
					System.out.println(a[i]);
					break;
				}
			}
		}
	}

}