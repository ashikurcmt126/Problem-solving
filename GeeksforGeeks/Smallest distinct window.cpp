#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    cin.ignore();
    while(t--){
        string s1;getline(cin,s1);
    int a[256]={0};
    int b[256]={0};
    int c=0,min_s=INT_MAX;
    for(int i=0;i<s1.length();i++){
        if(a[s1[i]]==0){
            c++;
            a[s1[i]]++;
        }

    }
    int temp=0,i=0,j=0;
    int start=0,en=0;
    while(j<s1.length()){
        while(j<s1.length()&&temp!=c){
           b[s1[j]]++;
           if(b[s1[j]]==a[s1[j]])temp++;
           j++;
        }
        while(i<j&&temp==c){
            if(b[s1[i]]==a[s1[i]])temp--;
            b[s1[i]]--;
            if(min_s>(j-i)){
               start=i;en=j;min_s=j-i;
            }
            i++;
        }
    }
    cout<<min_s<<endl;
    }

}