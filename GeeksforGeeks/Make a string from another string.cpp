#include<iostream>
#include<bits/stdc++.h>
using namespace std;
/*
GeeksforGeeks
rteksfoGrdsskGeggehes
*/
int main()
{
    int t;cin>>t;
    while(t-->0){
        string s1;cin>>s1;
        string s2;cin>>s2;
        int a[26]={0};
        int b[26]={0};
        int a1[26]={0};
        int b1[26]={0};
        for(int i=0;i<s1.length();i++){
           if(s1[i]>=65&&s1[i]<=90){
             a1[s1[i]-65]++;
           }
           else{
             a[s1[i]-97]++;
           }
        }
        for(int i=0;i<s2.length();i++){
           if(s2[i]>=65&&s2[i]<=90){
             b1[s2[i]-65]++;
           }
           else{
             b[s2[i]-97]++;
           }
        }
        int sum1=0,sum2=0;
        for(int i=0;i<26;i++){
           if(a1[i]<=b1[i]){
            sum1=sum1+a1[i];
           }
           if(a[i]<=b[i]){
            sum2=sum2+a[i];
           }
        }
        int Ashik=sum1+sum2;
        if(Ashik==s1.length()){
            cout<<"1"<<endl;
        }
        else{
            cout<<"0"<<endl;
        }

    }
    return 0;
}