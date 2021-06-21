#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n,count=0;cin>>n;
    string s;
    while(n--){
        cin>>s;
        if(s=="++X" || s=="X++"){
            count++;
        }else count--;
    }
    cout<<count<<endl;
}
