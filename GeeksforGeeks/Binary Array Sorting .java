public class ArraySort {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			char ch[]=new char[n];
			for(int i=0;i<n;i++){
				ch[i]=sc.next().charAt(0);
			}
			Arrays.sort(ch);
			for(int i=0;i<n;i++){
				System.out.print(ch[i]+" ");
			}
			System.out.println();
		}
	}

}
