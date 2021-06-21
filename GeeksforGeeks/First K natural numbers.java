public class KNaturalNum {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int k=sc.nextInt();
			int a[]=new int[n];
			ArrayList array=new ArrayList();
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				array.add(a[i]);
			}
			int b=1;
			int c=0;
			while(true){
				if(!array.contains(b)){
					c++;
					System.out.print(b+" ");
					if(c>k-1)break;
				}
				b++;
			}
			System.out.println();
			
		}
	}

}