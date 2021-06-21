public class AddingOne {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			String s="";
			char ch[]=new char[n];
			for(int i=0;i<n;i++){
				ch[i]=sc.next().charAt(0);
				s=s+ch[i];
			}
			String ashik="";
			int c=0,d=0;
			int b=ch[n-1]-48;
			b++;
			c=b/10;
			d=b%10;
			ashik=ashik+d;
			for(int i=n-2;i>=0;i--){
				b=ch[i]-48;
				b=b+c;
				c=b/10;
				d=b%10;
				ashik=ashik+d;
			}
			if(c!=0)ashik+=c;
			//System.out.println(ashik);
			for(int i=ashik.length()-1;i>=0;i--){
				System.out.print(ashik.charAt(i)+" ");
			}
			System.out.println();
			
		}
	}

}