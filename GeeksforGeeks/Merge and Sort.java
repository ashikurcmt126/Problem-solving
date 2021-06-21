public class MergeAndS {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int k=0;
			Vector v=new Vector();
			for(int i=0;i<n;i++){
				int a=sc.nextInt();
				int rashid[]=new int[a];
				for(int j=0;j<a;j++){
					rashid[j]=sc.nextInt();
					v.add(rashid[j]);
				}
			}
			Collections.sort(v);
			int k1=(int) v.get(0);
			for(int i=1;i<v.size();i++){
				if((int)v.get(i)==k1){
					
				}else{
					System.out.print(v.get(i-1)+" ");
					k1=(int) v.get(i);
				}
			}
			System.out.println(v.get(v.size()-1));
		}
	}

}