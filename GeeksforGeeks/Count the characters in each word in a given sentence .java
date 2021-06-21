public class CountWord {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0){
			int count=0;
			String Bangla=sc.nextLine();
			for(int i=0;i<Bangla.length();i++){
				if(Bangla.charAt(i)!=' '){
					count++;
				}
				else if(Bangla.charAt(i)==' '){
					System.out.print(count+" ");
					count=0;
				}
				
			}
			System.out.println(count);
			
		}
	}

}