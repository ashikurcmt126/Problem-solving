public class Common {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int m,n;
			if(a<b){
				m=b;n=a;
			}else{
				m=a;n=b;
			}
			int count=0;
			for(int i=1;i<=m/2;i++){
				if(a%i==0&&b%i==0){
					count++;
				}
			}
			System.out.println(count);
		}
	}

}