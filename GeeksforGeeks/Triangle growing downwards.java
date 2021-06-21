public class Triangle {
	public static void main(String args[]){
		Scanner sc=new  Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			
			String s=sc.next();
			for(int i=0;i<s.length();i++){
				int k=0;
				for(int j=s.length()-1;j>=0;j--){
					if(i>=j){
						System.out.print(s.charAt(k));k++;
					}else{
						System.out.print(".");
					}
				}
				System.out.println();
			}
		}
	}

}