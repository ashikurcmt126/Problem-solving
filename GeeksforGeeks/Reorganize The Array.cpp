#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        int n;cin>>n;
    int a[n];
    int b[n]={-1};
    for(int i=0;i<n;i++){
        cin>>a[i];
        if(a[i]>=0){
            b[a[i]]=a[i];
        }
    }
    for(int i=0;i<n;i++){
        if(i!=0&&b[i]!=i)b[i]=-1;
        cout<<b[i]<<" ";
    }
   cout<<endl;
}

return 0;
}