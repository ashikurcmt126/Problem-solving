public class SplitTheString {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-- >0)
		{
		    String str=sc.next();
		    int temp=0;
		    
		    if(temp==0)
		    {
		        for(int i=1;i<str.length();i++)
		        {
		            for(int j=i+1;j<str.length();j++)
		            {
		                for(int k=j+1;k<str.length();k++)
		                {
		                    String s1=str.substring(0,i);
		                    String s2=str.substring(i,j);
		                    String s3=str.substring(j,k);
		                    String s4=str.substring(k,str.length());
		                   if(!s1.equals(s2) &&!s1.equals(s3) && !s1.equals(s4) && !s2.equals(s3) && !s2.equals(s4) &&!s3.equals(s4))
		                   {
		                       temp=1;
		                       break;
		                   }
		                }
		            }
		        }
		    }
		    if(temp==1)
		    {
		        System.out.println("1");
		    }
		    else if( temp==0)
		    {
		        System.out.println("0");
		    }
		    
		}
	 }
}