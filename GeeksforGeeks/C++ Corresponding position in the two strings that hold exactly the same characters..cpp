#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t--){
        string s1;cin>>s1;
        string s2;cin>>s2;
        transform(s1.begin(), s1.end(), s1.begin(), ::tolower);
        transform(s2.begin(), s2.end(), s2.begin(), ::tolower);

        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.at(i)==s2.at(i)){
                count++;
            }
        }
        cout<<count<<endl;
    }
}