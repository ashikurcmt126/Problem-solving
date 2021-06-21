#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t--){
        string s;cin>>s;
        char ch;cin>>ch;
        int n;cin>>n;
        map<char,int> m;
        int check=0;
        int k=0;int ashikur=0;
        if(n==0){
            cout<<s<<endl;
        }else{
        for(int i=0;i<s.length();i++){
            m[s[i]]++;
            if(ch==s.at(i)&&m[s[i]]==n&&i+1==s.length()){
                    ashikur=1;
                check=1;break;
            }
            else if(ch==s.at(i)&&m[s[i]]==n){
                ashikur=1;
                k=i;break;
            }
        }
        if(ashikur==0){
            check=1;
        }
        if(check==1){
            cout<<"Empty string"<<endl;
        }else{
        cout<<s.substr(k+1,s.length())<<endl;
        }
        }

    }
}