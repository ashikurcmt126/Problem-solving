public class ArithMetic {
	public static void main(String args[]){
		Scanner sc=new  Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			double d=((b*b)-4*a*c);
			if(d<0){
				System.out.println("COMPLEX");
			}
			else{
				d=Math.sqrt(d);
				double d1=(-b-d)/(2*a);
				double d2=(-b+d)/(2*a);
				float d3=(float)d1;
				float d4=(float)d2;
				
				if(d1<d2){
					System.out.println(d3+" "+d4);
				}else{
					System.out.println(d4+" "+d3);
				}
			}
		}
	}

}