public class Germain {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			for(int i=2;i<n;i++){
				if(isp(i)&&isp((i*2)+1)){
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
	}

	private static boolean isp(int i) {
		for(int j=2;j<=Math.sqrt(i);j++){
			if(i%j==0){
				return false;
			}
		}
		return true;
	}

}