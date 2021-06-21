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
    int c=0;
    map<int,bool> m;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if((a[i]+a[j])%k==0&&m[i]==false&&m[j]==false){
                m[j]=true;
                m[i]=true;
                c+=2;break;
            }
        }
    }
    if(c==n)cout<<"True"<<endl;else{
        cout<<"False"<<endl;
    }
    }
    return 0;
}