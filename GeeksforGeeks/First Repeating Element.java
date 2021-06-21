public class FirstRepe {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				if(map.containsKey(a[i])){
					int x=map.get(a[i])+1;
					map.put(a[i],x);
				}else{
					map.put(a[i],1);
				}
			}
			int check=0;
			for(int i=0;i<n;i++){
				if(map.get(a[i])>=2){
					System.out.println(i+1);
					check=1;
					break;
				}
			}
			if(check==0){
				System.out.println("-1");
			}
			
			
		}
	}

}