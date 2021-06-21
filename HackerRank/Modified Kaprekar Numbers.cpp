#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
long long length(long long value)
{
    long long i=0;
    while(value!=0){
        value=value/10;
        i++;
    }
    return i;
}
int main()
{
    long long x,y,n=0;
    cin>>x>>y;
    for(long long f=x;f<=y;f++){
        long long a,b,g=1;
    long long sum1=0;
    long long k=length(f*f);
    long long s=f*f;
    if(k%2==0){
        a=k/2;
        b=k-a;
    }
    else{
        a=(k/2)+1;
        b=k-a;
    }
    while(a>0){
        sum1=sum1+(s%10)*g;
        g=g*10;
        s=s/10;
        a--;
    }
    if((sum1+s)==f){
            n=1;
        cout<<f<<" ";
    }
    }
    if(n==0){
        cout<<"INVALID RANGE"<<endl;
    }
    return 0;
}