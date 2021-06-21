public class RemBandAC {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			//ArrayList<Character> al=new ArrayList<Character>();
			for(int i=0;i<s.length()-1;i++){
				if(s.charAt(i)=='b'){}
				else if(s.charAt(i)=='a'){
					if(s.charAt(i+1)=='c'){
						i++;
					}else{
						System.out.print(s.charAt(i));
					}
				}else{
					System.out.print(s.charAt(i));
				}
			}
			if(s.charAt(s.length()-1)=='c'&&s.charAt(s.length()-2)!='a'){
				System.out.print('c');
			}
			else if(s.charAt(s.length()-1)!='b'){
				System.out.print(s.charAt(s.length()-1));
			}
			System.out.println();
		}
	}

}