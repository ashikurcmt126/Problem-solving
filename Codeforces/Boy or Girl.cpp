#include<bits/stdc++.h>
using namespace std;
/*
wjmzbmr
*/
int main()
{
    string s;cin>>s;
    sort(s.begin(),s.end());
    int count=1;
    char ch=s[0];
    for(int i=1;i<s.length();i++){
        if(ch!=s[i]){
            ch=s[i];
            count++;
        }
    }
    if(count%2==0)cout<<"CHAT WITH HER!"<<endl;
    else cout<<"IGNORE HIM!"<<endl;
}


