#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        string s;cin>>s;
    int k;cin>>k;
    int c=0;
    for(int i=0;i<s.length();i++){
            map<char,int> m;
            int l=0;
        for(int j=i;j<s.length();j++){
           m[s[j]]++;
    if(m[s[j]]==1)l++;
    if(l==k){
        c++;
    }
    if(l>k)break;
        }
    }
    cout<<c<<endl;
    }
    return 0;
}