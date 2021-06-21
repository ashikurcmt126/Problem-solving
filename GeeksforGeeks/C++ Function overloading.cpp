#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t--){
        int n;cin>>n;
        if(n==1){
            int a,b;cin>>a>>b;
            int maxi=max(a,b);
            cout<<maxi<<endl;
        }
        else if(n==3){
            double a,b;cin>>a>>b;
            double maxi=max(a,b);
            cout<<maxi<<endl;
        }
        else{
            char ch1,ch2;cin>>ch1>>ch2;
            if(ch1<ch2){
                cout<<ch2<<endl;
            }else{
                cout<<ch1<<endl;
            }
        }
    }
}