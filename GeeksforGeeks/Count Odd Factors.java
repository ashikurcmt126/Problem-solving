public class countOddFac {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int count=0;
			for(int i=1;i<=Math.sqrt(n);i++){
				if(i*i<=n){
					count++;
				}else{
					break;
				}
			}
			System.out.println(count);
		}
	}

}