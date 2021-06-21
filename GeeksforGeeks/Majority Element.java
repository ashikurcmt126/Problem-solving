public class MajorityEle {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
			int count=0,key=0;
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				if(map.containsKey(a[i])){
					int x=map.get(a[i])+1;
					if(x>count){
					count=x;
					key=a[i];
					}
					map.put(a[i],x);
				}else{
					map.put(a[i],1);
				}
			}
			if(count>n/2){
				System.out.println(key);
			}else{
				System.out.println("NO Majority Element");
			}
			
			
		}
	}

}