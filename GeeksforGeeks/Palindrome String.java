public class Palin {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			String s=sc.next();
			int c=0;
			for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
				if(s.charAt(i)==s.charAt(j)){
					
				}
				else{
					c=1;break;
				}
			}
			if(c==0){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}

}