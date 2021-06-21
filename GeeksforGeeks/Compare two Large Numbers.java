import java.math.BigInteger;
public class TwoLarge {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine());
		while(t-->0){
			BigInteger s1=new BigInteger(sc.nextLine());
			BigInteger s2=new BigInteger(sc.nextLine());
			if(s1.compareTo(s2)==-1){
				System.out.println(1);
			}else if(s1.compareTo(s2)==1){
				System.out.println(2);
			}else{
				System.out.println(3);
			}
		}
	}

}