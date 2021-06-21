public class DateValid {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			if(c>=1800&&c<=9999){
				if(b==2&&(a>=1&&a<=28)){
					System.out.println(1);
				}
				else if((b==1||b==3||b==5||b==7||b==8||b==10||b==12)&&(a>=1&&a<=31)){
					System.out.println(1);
				}
				else if((b==4||b==6||b==9||b==11)&&(a>=1&&a<=30)){
					System.out.println(1);
				}
				else{
				System.out.println(0);
				}
			}else{
				System.out.println(0);
			}
		}
	}
}