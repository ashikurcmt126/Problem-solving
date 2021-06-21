#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
		while(t-->0){
			string s;cin>>s;
			int ch[26]={0};
			for(int i=0;i<s.length();i++){
				ch[s[i]-97]++;
			}
			for(int i=25;i>=0;i--){
				for(int j=1;j<=ch[i];j++){
					cout<<(char)(i+97);

				}
			}
			cout<<endl;

		}
}