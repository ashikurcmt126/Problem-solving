public class MoveZero {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			String s1="",s2="";
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				if(a[i]==0){
					s1+="0 ";
				}else{
					s2+=a[i]+" ";
				}
			}
			System.out.println(s2+s1);
			
		}
	}

}