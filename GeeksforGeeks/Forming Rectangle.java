public class FormingRect {
	public static void main(String args[]){
		Scanner sc=new  Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			if(n%2==1||n<6)System.out.println(0);
			else if(n%4==0){
				System.out.println(n/4-1);
			}else if(n%2==0){
				System.out.println(n/4);
			}
		}
	}

}