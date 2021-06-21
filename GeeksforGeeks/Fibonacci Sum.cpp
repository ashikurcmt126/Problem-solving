#include<iostream>
using namespace std;
#define MAX 100000
int main() {
	//code
	int i,t,n,sum=0,f=0,s=1,k=0,a[100001];
	while(k<=MAX)
	  {
	      a[k] = (f%1000000007 + s%1000000007 )%1000000007 ;
	      f=s%1000000007 ;
	      s=a[k]%1000000007;
	      k++;
	  }
	scanf("%d",&t);
	while(t-->0)
	{
	  scanf("%d",&n);
	 // k=0;sum=0;f=0;s=1;
	  
	  printf("%d\n",a[n]-1);
	}
	return 0;
}