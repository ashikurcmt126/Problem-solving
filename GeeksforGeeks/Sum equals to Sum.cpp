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
    map<int,int> m;
    int check1=0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(m.find(a[i]+a[j])!=m.end()&&m[a[i]+a[j]]!=a[j]){
                check1=1;
            }
            else
                m[a[i]+a[j]]=a[j];
        }
        if(check1==1){
            break;
        }
    }
    if(check1==0){
        cout<<"0"<<endl;
    }
    else{
        cout<<"1"<<endl;
    }
    }
}