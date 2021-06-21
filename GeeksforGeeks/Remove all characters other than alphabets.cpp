#include<bits/stdc++.h>
#include <limits>
using namespace std;
int main()
{
    
    int t;cin>>t;string s;
    cin.ignore();
    while(t-->0){
            
    getline(cin,s);
    string str="";
    int g=0;
    char ch;
    for(int i=0;i<s.length();i++){
        ch=s[i];
        if((ch>=65&&ch<=90)||(ch>=97&&ch<=122)){
            g=1;
            cout<<ch;
        }
    }
   if(g==0){
       
       cout<<"-1"<<endl;
   }else{
       cout<<endl;
   }

    }
}