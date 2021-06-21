public class segregate {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			ArrayList<Integer> al=new ArrayList<Integer>();
			ArrayList<Integer> al2=new ArrayList<Integer>();
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				if(a[i]%2==0){
					al.add(a[i]);
				}else{
					al2.add(a[i]);
				}
			}
			Collections.sort(al);
			for(int i=0;i<al.size();i++){
				System.out.print(al.get(i)+" ");
			}
			Collections.sort(al2);
			for(int i=0;i<al2.size();i++){
				System.out.print(al2.get(i)+" ");
			}
			System.out.println();
		}
	}

}