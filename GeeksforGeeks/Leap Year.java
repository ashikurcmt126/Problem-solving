public class Leap {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			
			 if(n%400==0){
			     System.out.println("Yes");
			 }
			 else if(n%100==0){
			     System.out.println("No");
			 }
			 else if(n%4==0){
			     System.out.println("Yes");
			 }
			 
			 else{
			     System.out.println("No");
			 }
		}
	}

}