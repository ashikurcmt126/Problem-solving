#include<bits/stdc++.h>

using namespace std;
int main()
{
    int t,n,d;
    cin>>t;
    while(t-->0){
        cin>>n;
        int a[n];
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        cin>>d;
        for(int i=0;i<n;i++){
            cout<<a[(i+d)%n]<<" ";
        }
        cout<<endl;
    }
}