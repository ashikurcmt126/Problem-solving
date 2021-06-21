#include<bits/stdc++.h>
using namespace std;
int main()
{
   int t;cin>>t;
   while(t-->0){
     string s;cin>>s;
    char ch=s[s.length()-1];
    int check=(int)ch-48;
    //cout<<check<<endl;
    int carry=0;
    int sum=0,add=0,final_s=0;
    string si="";
    if(check==0){
        cout<<s<<endl;
    }
    else if(check>=6&&check<=9){
        sum=0;
        carry=s[s.length()-1]-48;
        add=10-carry;
        final_s=0;
        final_s=carry+add;
        add=final_s%10;
        si+=add+48;
        carry=final_s/10;

        for(int j=s.length()-2;j>=0;j--){
            sum=s[j]-48;
            final_s=sum+carry;
            si+=(final_s%10)+48;
            carry=final_s/10;

        }
        if(carry>0){
            si+=carry+48;
        }
        for(int i=si.length()-1;i>=0;i--){
            cout<<si[i];
        }
        cout<<endl;

    }
    else if(check>=1&&check<=5){
        s[s.length()-1]=0+48;
        for(int j=0;j<s.length();j++){
            cout<<s[j];
        }
        cout<<endl;

    }
   }
return 0;
}