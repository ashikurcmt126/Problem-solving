#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        long int n;cin>>n;
    long int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    set<long int> s;
    for(int i=0;i<n;i++){
        if(a[i]%2==0){
            s.insert(a[i]);
        }
    }
    cout<<(long int) (pow(2,s.size())-1)<<endl;
    }
   return 0;
}