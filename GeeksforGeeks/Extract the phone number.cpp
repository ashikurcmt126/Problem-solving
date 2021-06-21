#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    cin.ignore();
    while(t--){

        string s;
        getline(cin,s);
        string ashik="";int b=0,c=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s[i]=='+'){
                b=1;
            }
            if(b==1&&s[i]!=' '){
                ashik=ashik+s[i];
                count++;
            }
            else if(count==15){
                break;
            }else{
                count=0;
                ashik="";
            }

        }
        cout<<ashik<<endl;
    }
}