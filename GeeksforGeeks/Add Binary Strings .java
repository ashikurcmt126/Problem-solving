public class AddBinary {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			
			int l1=s.length()-1,l2=s1.length()-1;
			String result="";
			int carry=0;
			while(l1>=0||l2>=0||carry==1){
				if(l1>=0){
					carry+=s.charAt(l1)-48;
				}
				if(l2>=0){
					carry+=s1.charAt(l2)-48;
				}
				
				result=(char)(carry%2+'0')+result;
				
				carry/=2;
				l1--;l2--;
			}
			System.out.println(result);
		}
	}

}