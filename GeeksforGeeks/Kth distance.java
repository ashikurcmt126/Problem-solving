public class KthDistance {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int k=sc.nextInt();
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int c=0;
			HashSet<Integer> map=new HashSet<Integer>();
			for(int i=0;i<n;i++){
				if(map.contains(a[i])){
					c=1;
					System.out.println("True");break;
				}else{
					map.add(a[i]);
				}
				if(i>=k){
					map.remove(a[i-k]);
				}
				
			
			}
			if(c==0){
				System.out.println("False");
			}
					
		}
	}

}