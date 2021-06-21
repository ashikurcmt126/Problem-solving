#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int t;
    cin>>t;
    while(t-->0){
        string s;
        cin>>s;
        
        int i=0;
        int j=s.length()-1;
         int ans=0;
        while(i<=j){
            int maxi=max((int)s.at(i),(int)s.at(j));
            int mini=min((int)s.at(i),(int)s.at(j));
           
            ans+=maxi-mini;
            i++;
            j--;
        }
        cout<<ans<<endl;
    }
    return 0;
}