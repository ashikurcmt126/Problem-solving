#include<bits/stdc++.h>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--)
	{
	    int n,sum;
	    cin>>n;
	    int arr[n];
	    for(int i=0;i<n;i++)
	    {
	        cin>>arr[i];
	    }
	    cin>>sum;
	    map<int,int> m;
	    int csum=0;
	    m[csum]++;
	    int ans=0;
	    for(int i=0;i<n;i++)
	    {
	        csum+=arr[i];
	        if(m.find(csum-sum)!=m.end())
	        {
	            ans+=m[csum-sum];
	        }
	        m[csum]++;
	    }
	    cout<<ans<<endl;
	}
	return 0;
}