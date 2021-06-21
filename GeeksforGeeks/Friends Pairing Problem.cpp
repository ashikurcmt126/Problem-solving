#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        int n;cin>>n;
    long long int a[n+1];
    a[0]=0;
    a[1]=1;
    a[2]=2;
    for(int i=3;i<=n;i++){
        a[i]=(((i-1)*a[i-2])+a[i-1])%1000000007;
    }
    cout<<a[n]<<endl;
    }
    return 0;
}