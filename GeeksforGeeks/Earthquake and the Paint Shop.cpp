#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;

    while(t--){

        int n;cin>>n;
     cin.ignore();
        string s[n];
        for(int i=0;i<n;i++){
            getline(cin,s[i]);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(s[j]>s[i]){
                    swap(s[j],s[i]);
                }
            }
        }
      
        int count=1;
        int i;
        for(i=1;i<n;i++){
            if(s[i-1]==s[i]){
                count++;
            }else{
                cout<<s[i-1]<<" "<<count<<endl;
                count=1;
            }
        }
        cout<<s[i-1]<<" "<<count<<endl;

    }

}