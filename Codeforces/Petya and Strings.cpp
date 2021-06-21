#include<bits/stdc++.h>
using namespace std;
int main()
{
    string s1,s2;
    cin>>s1>>s2;
    int k=0;

    for(int i=0;i<s1.length();i++){
        if(toupper(s1[i])>toupper(s2[i])){
                k=1;
           cout<<"1"<<endl;
           break;
        }
        else if(toupper(s1[i])<toupper(s2[i])){
            k=1;
           cout<<"-1"<<endl;
           break;
        }
    }
    if(k==0){
        cout<<"0"<<endl;
    }
}
