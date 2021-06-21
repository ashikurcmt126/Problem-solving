#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
int main() {
     int t;
    cin>>t;
    for(int i=0;i<t;i++){
        long long int a,b,c;
    cin>>a>>b>>c;
   long long int k=(b+c-2)%a+1;
    cout<<k<<endl;
    }
    return 0;
}