public class SpecialSeries {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int fs=0,sum=1,ashik=1;
			for(int i=1;i<=n;i++){
				ashik++;
				fs=fs+sum;
				sum=sum+ashik;
			}
			System.out.println(fs);
		}
	}

}