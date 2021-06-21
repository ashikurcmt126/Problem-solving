public class SortString {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			char ch[]=s.toCharArray();
			Arrays.sort(ch);
			int k=s.length();
			for(int i=0;i<k;i++){
				System.out.print(ch[i]);
			}
			System.out.println();
		}
	}

}