public class EOTurn {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int x=sc.nextInt();
			int y=sc.nextInt();
			int p=sc.nextInt();
			if(p%2!=0){
			    x=x*2;
			}
			int d=Math.max(x,y)/Math.min(x,y);
		    System.out.println(d);
		}
	}

}