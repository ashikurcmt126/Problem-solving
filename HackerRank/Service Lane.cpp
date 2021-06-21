#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n,m;
    cin>>n>>m;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    int ashik,rashid;
    for(int i=0;i<m;i++){
        cin>>ashik>>rashid;
        int min=a[ashik];
        for(int k=ashik+1;k<=rashid;k++){
            if(min>a[k]){
                min=a[k];
            }
        }
        cout<<min<<endl;
    }  
    return 0;
}