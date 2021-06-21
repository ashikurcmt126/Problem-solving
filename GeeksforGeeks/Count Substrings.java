public class CountSub {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			int count=0;
			for(int i=0;i<s.length()-1;i++){
				if(s.charAt(i)=='0')continue;
				for(int j=i+1;j<s.length();j++){
					if(s.charAt(j)=='1')count++;
				}
			}
			System.out.println(count);
		}
	}

}