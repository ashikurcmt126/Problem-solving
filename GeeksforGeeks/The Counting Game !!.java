public class CountingGame {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			int count=0;
			for(int i=0;i<s.length();i++){
				if(Character.isUpperCase(s.charAt(i))){
					count++;
				}
			}
			System.out.println(count+1);
		}
	}

}
