#include<bits/stdc++.h>
using namespace std;
main()
{
   int n,k,count=0;
   cin>>n>>k;
   int a[n];
   for(int i=0;i<n;i++)cin>>a[i];
   for(int i=0;i<n;i++){
    if(a[i]>=a[k-1]&&a[i]>0){
        count++;
    }else break;
   }
   cout<<count<<endl;
}
