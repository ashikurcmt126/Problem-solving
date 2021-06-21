
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int T;
    cin>>T;
string s,ss; 
    
    for(int i=0;i<T;i++)
    {
       cin>>s;
       cin>>ss;
   
      int co=0,len=s.size();
      int len1=ss.size(); 
      if(len>len1)
       len=len1;
      for(int i=0;i<len-1;i++) 
     {
      if(s[i]==ss[i])
      {co++;break;}     
                        } 
     if(co==0)
      cout<<"NO\n";
     else
     cout<<"YES\n";
  

}
        return 0;
}