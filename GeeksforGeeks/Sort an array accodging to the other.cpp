#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        int n;cin>>n;
    int mi;cin>>mi;
    int a[n];
    map<int,int> m;
    for(int i=0;i<n;i++){
        cin>>a[i];
        m[a[i]]++;
    }
    sort(a,a+n);
    int k;
    for(int i=0;i<mi;i++){
        cin>>k;
        for(int j=0;j<m[k];j++){
            cout<<k<<" ";
        }
        m[k]=0;
    }
    for(int i=0;i<n;i++){
        if(m[a[i]]!=0){
            cout<<a[i]<<" ";
        }
    }
    cout<<endl;
    }
}