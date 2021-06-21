#include<bits/stdc++.h>
using namespace std;
int main(){
int t;cin>>t;cin.ignore();
while(t-->0){
    
			string s;

			getline(cin,s);
			string str="";
			int ch=0;
			for(int i=0;i<s.length();i++){

				 if(s[i]=='a'||s[i]=='A'||s[i]=='e'||s[i]=='E'||s[i]=='i'||s[i]=='I'
						||s[i]=='o'||s[i]=='O'||s[i]=='u'||s[i]=='U'||s[i]==' '){
					str=str+s[i];
					ch=1;
				}
			}
			if(ch==0){
                cout<<"No Vowel"<<endl;

			}else{
			cout<<str<<endl;
			}
}

	}