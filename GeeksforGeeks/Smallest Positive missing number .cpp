#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        int all[102]={0};
    int n;cin>>n;
    int a[n];
    int small=INT_MAX;
    for(int i=0;i<n;i++){
        cin>>a[i];
        if(a[i]>-1){
            all[a[i]]=1;
        }
        if(small>a[i]&&a[i]>0){
            small=a[i];
        }
    }
    for(int i=1;i<=101;i++){
        if(all[i]!=1){
            cout<<i<<endl;
            break;
        }
    }
    }

}