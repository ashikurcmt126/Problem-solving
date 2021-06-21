#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t--){
        int n;cin>>n;


        int c=4,l=3;
        while(n>c){
            l=l*2;
            c=c+l;
        }
        cout<<c-n<<endl;
    }
}
