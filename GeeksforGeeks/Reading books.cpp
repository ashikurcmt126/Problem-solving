#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t--){
        long int n;cin>>n;
        long int k;cin>>k;
        long int a1[n];
        long int a2[n];
        for(int i=0;i<n;i++){
            cin>>a1[i];
        }
        for(int i=0;i<n;i++){
            cin>>a2[i];
        }
        long int max=0;
        long int b=0;
        for(int i=0;i<n;i++){
       b=(k/a1[i])*a2[i];
            if(max<b){

                max=b;
            }

        }
        cout<<max<<endl;
    }
    return 0;
}