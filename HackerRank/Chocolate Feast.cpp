#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int x;
    cin>>x;
    for(int i=0;i<x;i++)
    {
        int n,c,m;
    cin>>n>>c>>m;
    int k,g,b,r;
    b=n/c;
    k=b;
    while(k>=m)
    {
        g=k/m;
        b=b+g;
        r=k%m;
        k=g+r;
    }
    cout<<b<<endl;
    }  
    return 0;
}