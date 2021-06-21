public class RedOrGreen {
	public static void main(String argrs[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			String s=sc.next();
			int count=0;
			for(int i=0;i<n;i++){
				if(s.charAt(i)=='G'){
					count++;
				}
			}
			int count2=s.length()-count;
			System.out.println(Math.min(count, count2));
		}
	}

}