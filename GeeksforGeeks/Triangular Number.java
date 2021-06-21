public class TriNum {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int s=0;
			int chek=0;
			for(int i=1;s<=n;i++){
				s+=i;
				if(s==n){
					chek=1;
					System.out.println(1);break;
				}
			}
			if(chek==0){
				System.out.println(0);
			}
		}
	}

}