#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t--){
        unsigned long long int n;
        cin>>n;
       unsigned long long int k=1,i=1,f=1;
      if(n==1){
        cout<<1<<endl;
      }else{

           for(int i=1;;i++){
            f=f*i;
            if(n>=f){
                cout<<f<<" ";
            }else{
             break;
            }
           }
           cout<<endl;
      }
    }
    return 0;
}