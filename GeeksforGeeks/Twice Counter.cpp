#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t--){
        int n;cin>>n;
        string s[n];
        map<string,int> m;
        for(int i=0;i<n;i++){
            cin>>s[i];
            m[s[i]]++;
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(m[s[i]]==2){
                count++;
                m[s[i]]=0;
            }
        }
        cout<<count<<endl;
    }
}