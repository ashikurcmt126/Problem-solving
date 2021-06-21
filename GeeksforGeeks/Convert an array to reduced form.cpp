#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        int n;cin>>n;
    int a[n];
    int b[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
        b[i]=a[i];
    }
    sort(a,a+n);
    map<int,int> m;
    for(int i=0;i<n;i++){
        m[a[i]]=i;
    }
    for(int i=0;i<n;i++){
        cout<<m[b[i]]<<" ";
    }
    cout<<endl;
    }
}