public class TransformPr {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			int sum=0;
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				sum+=a[i];
			}
			//System.out.println("sum: "+sum);
			int k=0;
			while(true){
				
				//System.out.println(sum);
				if(sum%2!=0){
					if(pm(sum)){
						System.out.println(k);
						break;
					}
				}
				sum+=1;
				k++;
			}
			
	}

	}

	private static boolean pm(int sum) {
		for(int i=2;i<=Math.sqrt(sum);i++){
			if(sum%i==0){
				return false;
			}
		}
		return true;
	}
}