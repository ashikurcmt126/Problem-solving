#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t--){
        int k;cin>>k;
        int n;cin>>n;
        int a[n];
        int ar[k+1]={0};
        for(int i=0;i<n;i++){
            cin>>a[i];
            for(int j=a[i];j<=k;j=j+a[i]){
                ar[j]=1;
            }
        }
        int count=0;
        for(int i=1;i<=k;i++){
            if(ar[i]==0){
                count++;
            }
        }
        cout<<count<<endl;
    }
}