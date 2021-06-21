#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        string s;
        cin>>s;
        int k;cin>>k;
        if(s.length() < 26)cout<<0<<endl;
        else{
        map<char,int> m;
        for(int i=0;i<s.length();i++){
            m[s[i]]++;
        }
        int total=26-m.size();
        if(total>k)cout<<0<<endl;
	    else cout<<1<<endl;
        }
    }
    return 0;
}