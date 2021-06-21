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
    sort(a,a+n);
    int b=a[0];
    int len=1,c=1;
    for(int i=1;i<n;i++){
        if((a[i]-b)==1){
            c++;
            b=a[i];
        }
        else{
            c=1;
            b=a[i];
        }
        len=max(len,c);
    }
    cout<<len<<endl;
   }
    return 0;
}