public class TwoFraction {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s1=sc.next();
			String s2=sc.next();
			long a=split1(s1);
			//System.out.println(a);
			long b=split2(s1);
		
			double ab=(double)b/(double)a;
			//System.out.println(ab);
			long c=split3(s2);
			long d=split2(s2);
			double cd=(double)d/(double)c;
			//System.out.println(cd);
			
			if(ab>cd){
				for(int i=0;i<s1.length()-1;i++){
					System.out.print(s1.charAt(i));
				}
				System.out.println();
			}
			else if(ab==cd){
				System.out.println("equal");
			}else{
				System.out.println(s2);
			}
			
		}
	}

	private static long split3(String s2) {
		long sum=0,b=1;
		for(int i=s2.length()-1;s2.charAt(i)!='/';i--){
			
			sum=(s2.charAt(i)-48)*b+sum;
			//System.out.println(s1.charAt(i)-48);
			b=b*10;
		}
		return sum;
	}

	private static long split1(String s1) {
		long sum=0,b=1;
		for(int i=s1.length()-2;s1.charAt(i)!='/';i--){
			
			sum=(s1.charAt(i)-48)*b+sum;
			//System.out.println(s1.charAt(i)-48);
			b=b*10;
		}
		return sum;
	}

	private static long split2(String s2) {
		int b=count(s2);
		b=b/10;
		int sum=0;
		for(int i=0;s2.charAt(i)!='/';i++){
			sum=(s2.charAt(i)-48)*b+sum;
			b=b/10;
		}
		return sum;
	}

	private static int count(String s2) {
		int count=1,b=1;
		for(int i=0;s2.charAt(i)!='/';i++){
			
			b=b*10;
		}
		return b;
	}

}