public class ColumnNameFrom {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long n=sc.nextLong();
			ArrayList<Character> map=new ArrayList<Character>();
			for(int i=0;i<26;i++)map.add((char)(65+i));
			
			StringBuilder s=new StringBuilder();
			while(n!=0){
				int r=(int) (n%26);
				if(r==0){
					s.append("Z");
					n=n/26-1;
				}else{
					s.append(map.get(r-1));
					n=n/26;
				}
			}
			System.out.println(s.reverse());
		}
	}

}