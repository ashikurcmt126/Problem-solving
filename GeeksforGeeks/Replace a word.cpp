#include<bits/stdc++.h>
using namespace std;
int main()
{
     int t;cin>>t;
     cin.ignore();
     while(t--){
    string s;
    //getline(cin,s);
    getline(cin,s);
    string find_w;getline(cin,find_w);
    string rep;getline(cin,rep);

    int g=0,n=find_w.length(),c=0;
    string si="";int check=0;
    for(int i=0;i<s.length();i++){
        if(s[i]==find_w[g]){
            c++;
            if(c!=n){
            si+=s[i];check=1;g++;
            }
            else{
               for(int j=0;j<rep.length();j++){
                    cout<<rep[j];si="";g=0;c=0;

                }
            }

        }
        else{
                if(c!=n&&check==1){
                    cout<<si;si="";
                    check=0;
                }

                cout<<s[i];
                g=0,c=0;si="";

        }
    }
    if(c!=n&&check==1){
        cout<<si;
    }
    cout<<endl;
}
    return 0;
}