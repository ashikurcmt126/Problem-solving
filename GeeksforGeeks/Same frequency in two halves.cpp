#include<bits/stdc++.h>
using namespace std;
int main()
{

    int t;cin>>t;
    while(t--){
       string s1;cin>>s1;int l=s1.length();
       string str1="";
       string str2="";
       int ch1[26]={0};
      int ch2[26]={0};
       if(l%2==0){
        for(int i=0;i<l/2;i++){
            str1=str1+s1[i];

        }
        for(int i=l/2;i<l;i++){
            str2=str2+s1[i];

        }
       }
       else{
        for(int i=0;i<l/2;i++){
            str1=str1+s1[i];

        }
        for(int i=l/2+1;i<l;i++){
            str2=str2+s1[i];

        }
       }
      for(int i=0;i<str1.length();i++){
        ch1[str1[i]-97]++;
      }
       for(int i=0;i<str1.length();i++){
        ch2[str2[i]-97]++;
      }
      //for(int i=0;i<26;i++){
      //  cout<<ch1[i]<<" "<<ch2[i]<<endl;
     // }
      int count=0;
      for(int i=0;i<26;i++){
        if(ch1[i]==ch2[i]&&ch1[i]!=0){
            count+=ch1[i];
        }
      }
      if(count==str1.length()){
        cout<<"YES"<<endl;
      }else{
        cout<<"NO"<<endl;
      }

    }
}