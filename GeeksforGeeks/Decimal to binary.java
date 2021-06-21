public class DeciToBinary {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			String str="";
			while(n!=0){
				str=str+n%2;
				n=n/2;
			}
			for(int i=str.length()-1;i>=0;i--){
				System.out.print(str.charAt(i));
			}
			System.out.println();
		}
	}

}
