public class Bitonic {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			ArrayList ashik1=new ArrayList();
			ArrayList ashik2=new ArrayList();
			int k=0,c=0;
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				if(i%2==0){
					ashik1.add(a[i]);
				}else{
					ashik2.add(a[i]);
				}
			}
			Collections.sort(ashik1);
			Collections.sort(ashik2);
			for(int i=0;i<ashik1.size();i++){
				System.out.print(ashik1.get(i)+" ");
			}
			for(int i=ashik2.size()-1;i>=0;i--){
				System.out.print(ashik2.get(i)+" ");
			}
			System.out.println();
			
			
		}
	}

}