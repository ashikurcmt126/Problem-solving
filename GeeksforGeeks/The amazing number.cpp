#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;cin>>t;
    while(t-->0){
        unsigned long long int n;cin>>n;
        unsigned long long int b=sqrt(n);
       int c=0;
       if((b*b)==n){
        for(int i=2;i<=sqrt(b);i++){
            if(n%i==0){
               c++;break;
            }
        }
        if(c>=1){
            cout<<0<<endl;
        }else{
            cout<<1<<endl;
        }
       }else{
        cout<<0<<endl;
       }


    }
}