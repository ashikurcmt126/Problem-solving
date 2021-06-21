public class LargestNumber {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Vector<String> v=new Vector<String>();
			for(int i=0;i<n;i++){
				String s=sc.next();
				v.add(s);
			}
			MakeLarge(v);
		}
		
		
	}

	private static void MakeLarge(Vector<String> v) {
			Collections.sort(v,new Comparator<String>(){

				@Override
				public int compare(String X, String Y) {
					String XY=X+Y;
					String YX=Y+X;
					
					return XY.compareTo(YX)>0?-1:1;
				}
				
			});
			
			Iterator it=v.iterator();
			while(it.hasNext()){
				System.out.print(it.next());
			}
			System.out.println();
	}

}