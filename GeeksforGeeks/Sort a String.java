public class SortStr {
	public static void main(String args[]){
		Scanner sc=new  Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			String s=sc.next();
			char ch[]=s.toCharArray();
			Arrays.sort(ch);
			for(int i=0;i<s.length();i++){
				System.out.print(ch[i]);
			}
			System.out.println();
		}
	}

}
}