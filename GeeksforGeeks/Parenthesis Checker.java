public class BalanceB {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			Stack<Character> THPI=new Stack<Character>();
			/*
			Stack<Character> TH=new Stack<Character>();
			Stack<Character> P=new Stack<Character>();
			Stack<Character> I=new Stack<Character>();
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='('||s.charAt(i)==')'){
					
					if(!TH.isEmpty()&&TH.peek()=='('&&s.charAt(i)==')'){
						TH.pop();
					}else{
						TH.push(s.charAt(i));
					}
				}
				else if(s.charAt(i)=='{'||s.charAt(i)=='}'){
					if(!P.isEmpty()&&P.peek()=='{'&&s.charAt(i)=='}'){
						P.pop();
					}else{
						P.push(s.charAt(i));
					}
				}
				else if(s.charAt(i)=='['||s.charAt(i)==']'){
					if(!I.isEmpty()&&I.peek()=='['&&s.charAt(i)==']'){
						I.pop();
					}else{
						I.push(s.charAt(i));
					}
				}
			}
			if(TH.isEmpty()&&P.isEmpty()&&I.isEmpty()){
				System.out.println("YES");
			}else System.out.println("NO");
			*/
			int Bangladesh=0;
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
					THPI.push(s.charAt(i));
				}else if(s.charAt(i)==')'){
					if(THPI.isEmpty()){
						System.out.println("not balanced");Bangladesh=1;break;
						}
					else if(THPI.peek()!='('){System.out.println("not balanced");Bangladesh=1;break;}
					else THPI.pop();
				}else if(s.charAt(i)=='}'){
					if(THPI.isEmpty()){
						System.out.println("not balanced");Bangladesh=1;break;
						}
					else if(THPI.peek()!='{'){System.out.println("not balanced");Bangladesh=1;break;}
					else THPI.pop();
				}else if(s.charAt(i)==']'){
					if(THPI.isEmpty()){
						System.out.println("not balanced");Bangladesh=1;break;
						}
					else if(THPI.peek()!='['){System.out.println("not balanced");Bangladesh=1;break;}
					else THPI.pop();
				}
				
			}
			if(Bangladesh==0){
				if(THPI.empty())System.out.println("balanced");else System.out.println("not balanced");
			}
			
			
		}
	}

}