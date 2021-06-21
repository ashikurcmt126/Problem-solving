#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
   string s[31]={"","one","two","three","four","five","six","seven","eight","nine","ten",
    "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty",
    "twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven",
    "twenty eight","twenty nine","thirty"};
    int h,m;
    cin>>h>>m;
    int b=0;
    if(m==0){
        cout<<s[h]<<" o' clock"<<endl;
    }
    else if(m==15){
        cout<<"quarter past "<<s[h]<<endl;
    }
    else if(m==30){
        cout<<"half past "<<s[h]<<endl;
    }
    else if(m==45){
        cout<<"quarter to "<<s[h+1]<<endl;
    }
    else if(30<m){
        b=60-m;
        cout<<s[b]<<" minutes to "<<s[h+1];
    }
    else if(0<m<29){
        cout<<s[m]<<" minutes past "<<s[h]<<endl;
    }
  
    return 0;
}