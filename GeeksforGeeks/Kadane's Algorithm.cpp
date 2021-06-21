#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        int n;cin>>n;
    int a[n];
    int c=0;
    for(int i=0;i<n;i++){
        cin>>a[i];
        if(a[i]<0)c++;
    }
    int sum=0,max=INT_MIN;
    if(c==n){

        for(int i=0;i<n;i++){
           if(max<a[i]){
            max=a[i];
           }
        }
        cout<<max<<endl;
    }
    else{
         for(int i=0;i<n;i++){
        sum+=a[i];
        if(sum<0)sum=0;
        if(max<sum)max=sum;
    }
    cout<<max<<endl;
    }
    }
}