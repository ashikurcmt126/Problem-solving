#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t--){
        int n;cin>>n;
			string s[n+1];
			for(int i=0;i<n;i++){
				cin>>s[i];
			}
			sort(s,s+n);
			string str="";int max=0,count=1;
			string str2=s[0];
			for(int i=1;i<n;i++){
                if(str2==s[i]){
                    count++;
                }
                else{
                    if(max<count){
                        str=s[i-1];
                        max=count;
                    }
                    count=1;
                    str2=s[i];
                }
			}
			if(count>max){
                cout<<s[n-1]<<endl;
			}else{
                cout<<str<<endl;
			}
    }
}