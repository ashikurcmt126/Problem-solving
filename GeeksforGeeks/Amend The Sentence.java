public class AmendSen {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			for(int i=0;i<s.length();i++){
				if(i==0&&Character.isUpperCase(s.charAt(i))){
					System.out.print(Character.toLowerCase(s.charAt(i)));
				}
				else if(Character.isUpperCase(s.charAt(i))){
					System.out.print(" "+Character.toLowerCase(s.charAt(i)));
				}
				else{
					System.out.print(s.charAt(i));
				}
				
			}
			System.out.println();
		}
	}

}