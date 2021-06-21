#include<bits/stdc++.h>
using namespace std;
int min(long a,long b)
{
    return (a<b)?a:b;
}

int main()
{
    long t;cin>>t;
    while(t-->0){
        int n,r;cin>>n>>r;
    long a[n+1][r+1];
    memset(a,0,sizeof(a));
    for(int i=0;i<=n;i++){
        for(int j=0;j<=min(i,r);j++){
            if(j==0||j==i){
                a[i][j]=1;
            }
            else{
                a[i][j]=(a[i-1][j-1]+a[i-1][j])%1000000007;
            }

        }
    }
cout<<a[n][r]<<endl;
    }
    return 0;
}