public class epectTwice {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n+2];
			for(int i=0;i<n+2;i++){
				a[i]=sc.nextInt();
			}
			HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
			for(int i=0;i<n+2;i++){
				if(map.containsKey(a[i])){
					int x=map.get(a[i])+1;
					if(x==2){
						System.out.print(a[i]+" ");
					}
					map.put(a[i],x);
				}else{
					map.put(a[i],1);
				}
			}
			
			System.out.println();
		}
	}

}