#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
	char ch;
	
	string s;
    cin>>t;

    while(t-->0){
cin.ignore();
        getline(cin,s);
         cin.get(ch);
        int c=0,flag=0;
        for(int i=0;i<s.length();i++){
            if(ch==s[i]){
                    flag=1;
                c=i;
            }
        }
        if(flag)
		cout<<c<<endl;
		else
		cout<<"-1"<<endl;
    }
}