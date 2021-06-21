public class CheckNum {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int a=sc.nextInt();int b=sc.nextInt();
			int i=0,c=0;
			while(i<=b){
				double d=Math.pow((double)a,i);
				i++;
				if((int)d==b){
					c=1;
					System.out.println("1");break;
				}
			}
			if(c==0){
				System.out.println(0);
			}
		}
	}

}