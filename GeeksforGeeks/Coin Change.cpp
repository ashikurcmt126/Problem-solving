#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        int n;cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    int k;cin>>k;
    sort(a,a+n);
    int dp[k+1];
    memset(dp,0,sizeof(dp));
    dp[0]=1;

    for(int i=1;i<=n;i++){
        for(int j=a[i-1];j<=k;j++){

                dp[j]=dp[j]+dp[j-a[i-1]];

        }
    }

    cout<<dp[k]<<endl;
    }
return 0;
}